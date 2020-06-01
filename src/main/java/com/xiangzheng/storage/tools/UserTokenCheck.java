package com.xiangzheng.storage.tools;

import com.xiangzheng.dealerservice.entity.SalesmanInfo;
import com.xiangzheng.dealerservice.service.SalesmanInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 检查用户是否存在和Token是否过期
 */
@Component
public class UserTokenCheck {

    @Autowired
    private SalesmanInfoService infoService;

    @Autowired
    private RedisUtil redisUtil;


    /**
     * userId 未解密
     * @param userId
     * @return
     */
    public ResponseAPI UserCheck(String userId){
        String id  = ParamTools.UserIdDecode(userId);
        SalesmanInfo info = infoService.selectById(id);
        if(info==null){
            return new ResponseAPI(CommonConstants.USER_NOT_EXIST,ResponseAPI.FAIL_FLAG,CommonConstants.USER_NOT_EXIST_MESSAGE,null);
        }
        String token = (String) redisUtil.get(CommonConstants.USER_TOKEN_PREFIX+userId);
        token = GenerateToken.GenerateTokenDECODE(token);
        if(token==null || token.trim().equals("")){
            return new ResponseAPI(CommonConstants.TOKEN_NOT_EXIST,ResponseAPI.FAIL_FLAG,CommonConstants.TOKEN_NOT_EXIST_MESSAGE,null);
        }
        String[] split = token.split("-");
        if(split==null || split.length==1 || "".equals(split[0])){
            return new ResponseAPI(CommonConstants.HEADER_PARAM_ERROR,ResponseAPI.FAIL_FLAG,CommonConstants.HEADER_PARAM_FAIL,null);
        }
        if(split!=null){
            if(split[0]!=null && split[0].equals(userId)){
                return ResponseAPI.SUCCESS();
            }
            // token 校验失败
            return new ResponseAPI(CommonConstants.HEADER_PARAM_ERROR,ResponseAPI.FAIL_FLAG,CommonConstants.HEADER_PARAM_FAIL,null);
        }
        return ResponseAPI.SUCCESS();
    }


}

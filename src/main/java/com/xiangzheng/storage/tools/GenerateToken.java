package com.xiangzheng.storage.tools;

/**
 * 生成Token
 */
public class GenerateToken {

    public static String GenerateToken(String userId,String openId){
        // 加密后的userId
        String encodeStr = userId+"-"+openId;
        String encodeUserId = AesEncodeUtil.encrypt(encodeStr);
        return encodeUserId;
    }

    /**
     * token 解析
     * @param userId
     * @param openId
     * @return
     */
    public static String GenerateTokenDECODE(String token){
        String  tokenDecode = AesEncodeUtil.decrypt(token);
        return tokenDecode;
    }

    public static void main(String[] args) {
        System.out.println(GenerateToken("qwd7Le1NGL","oeOsRwP7XEM7wJH844fcbsz7UyOk"));
    }

}

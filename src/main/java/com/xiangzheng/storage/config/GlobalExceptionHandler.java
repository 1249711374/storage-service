package com.xiangzheng.storage.config;


import com.xiangzheng.storage.tools.CommonMessageEnum;
import com.xiangzheng.storage.tools.ResponseAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

//    /**
//     * 处理自定义的业务异常
//     * @param req
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(value = BizException.class)
//    @ResponseBody
//    public ResultBody bizExceptionHandler(HttpServletRequest req, BizException e){
//        logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
//        return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
//    }

    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResponseAPI exceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error("发生空指针异常！原因是:",e);
        return new ResponseAPI(CommonMessageEnum.REQUEST_PARAM_NULL);
    }

    /**
     * 处理运行时异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =RuntimeException.class)
    @ResponseBody
    public ResponseAPI exceptionHandler(HttpServletRequest req, RuntimeException e){
        logger.error("未知异常！原因是:",e);
        return new ResponseAPI(500,false,e.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseAPI MyExceptionHandle(MethodArgumentNotValidException exception){
        BindingResult result = exception.getBindingResult();
        StringBuilder errorMsg = new StringBuilder() ;

        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            fieldErrors.forEach(error -> {
                System.out.println("field" + error.getField() + ", msg:" + error.getDefaultMessage());
                errorMsg.append(error.getDefaultMessage()).append("!");
            });
        }

        exception.printStackTrace();
        return new ResponseAPI(500,false,errorMsg.toString() );
    }


    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResponseAPI exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:",e);
        return new ResponseAPI(500,false,e.getMessage());
    }


}

package com.xiangzheng.storage.tools;



import java.io.Serializable;

/**
 * 相应实体类
 */

public class ResponseAPI<T> implements Serializable {
    // 成功
    public final static boolean SUCCESS_FLAG = true;
    // 失败
    public final static boolean FAIL_FLAG = false;
    // 成功状态码
    public final static int SUCCESS_CODE = 200;
    // 成功失败状态码
    public final static int FAIL_CODE = 9999;


    // (value = "状态码,成功为200", example = "200")
    private int code;

    // (value = "成功标识", example = "true")
    private boolean success;

    // (value = "状态码为200时，message为OK， 否则为错误信息", example = "OK")
    private String message;

    // (value = "返回数据")
    private T data;

    // (value = "时间戳", example = "1853558969352")
    private long timestamp = System.currentTimeMillis();

    public ResponseAPI() {
    }

    public ResponseAPI(CommonMessageEnum commonMessageEnum){
        this.code = commonMessageEnum.getCode();
        this.success = commonMessageEnum.getSuccess();
        this.message = commonMessageEnum.getMessage();
    }

    public ResponseAPI(CommonMessageEnum commonMessageEnum,T data){
        this.code = commonMessageEnum.getCode();
        this.success = commonMessageEnum.getSuccess();
        this.message = commonMessageEnum.getMessage();
        this.data = data;
    }

    public ResponseAPI(int code, boolean success,String message) {
        this.code = code;
        this.success = success;
        this.message = message;
    }

    public ResponseAPI(int code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static ResponseAPI SUCCESS(){
        return new ResponseAPI(SUCCESS_CODE,true,"操作成功");
    }

    public static ResponseAPI SUCCESS(String message){
        return new ResponseAPI(SUCCESS_CODE,true,message);
    }

    public static ResponseAPI FAIL(){
        return new ResponseAPI(FAIL_CODE,false,"操作失败");
    }

    public static ResponseAPI FAIL(String message){
        return new ResponseAPI(FAIL_CODE,false,message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

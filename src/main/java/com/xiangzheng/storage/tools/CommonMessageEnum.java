package com.xiangzheng.storage.tools;

public enum CommonMessageEnum {

    SUCCESS(200,true,"操作成功"),
    ERROR(9999,false,"系统错误"),


    REQUEST_PARAM_NULL(4000001,"空参或参数缺失"),
    PARAM_DATA_ERROR(4000002, "参数内容或类型不正确"),
    JSON_FORMAT_ERROR(4000003,"JSON无法解析"),
    PICTURE_DATA_ERROR(4000004,"图片尺寸超过限制（过大或为0"),
    NO_AUTHORITY(4030001, "无权限操作"),
    LOCKED_STATUS_NOT_ALLOW_EDIT(4030002,"对象被他人锁定无法操作"),
    BANGING_STATUS_NOT_ALLOW_DELETE(4030003,"存在依赖绑定无法删除"),
    FRONT_CATEGORY_NOT_EXIST(4040001,"(上级)前台类目不存在"),
    BACK_CATEGORY_NOT_EXIST(4040002,"(上级)后台类目不存在"),
    PRODUCT_NOT_EXIST(4040003,"商品不存在"),
    USER_LEVEL_NOT_EXIST(4040004,"用户等级不存在"),
    USER_LABLE_NOT_EXIST(4040005,"用户标签不存在"),
    DEALER_NOT_EXIST(4040006,"经销商不存在"),
    STORE_NOT_EXIST(4040007,"店铺不存在"),
    ATTR_EXIST(4040008,"规格已存在"),
    ATTR_VALUE_NOT_EXIST(4040009,"规格值已存在"),
    FRONT_JOIN_PRODUCT_EXIST(4040010,"前台类目已存在该商品"),
    DEALER_JOIN_PRODUCT_EXIST(4040011,"经销商下已经存在该商品"),
    DEALER_EXIST(4040012,"经销商已存在"),
    CATE_NOT_EXIST(4040013,"经销商类别不存在"),
    LEVEL_EXIST(4040014,"经销商等级已存在"),
    CATE_EXIST(4040015,"经销商类别已存在"),
    LEVEL_NOT_EXIST(4040016,"经销商等级不存在"),
    BRAND_NOT_EXIST(4040017,"品牌不存在"),
    BRAND_EXIST(4040018,"品牌已存在"),
    ACTIVITY_NOT_EXIST(4040019,"营销活动不存在"),
    ACTIVITY_EXIST(4040020,"营销活动已存在"),
    UNIT_NOT_EXIST(4040021,"计量单位不存在"),
    UNIT_EXIST(4040022,"计量单位已存在"),
    ATTR_NOT_EXIST(4040023,"系统规格不存在"),
    FRONT_CATE_EXIST(4040024,"前台类目已存在"),


    DB_CONNECT_FAIL(5000001,"数据库连接错误"),
    DB_OPERATE_FAIL(5000002,"数据库操作错误"),
    OUT_SERVER_CONNECT_FAIL(5000003,"外部服务连接错误"),
    PICTURE_UPLOAD_ERROR(5000004,"图片上传失败");

    private Integer code;

    private String message;

    private boolean success;


    CommonMessageEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.success = false;
    }

    CommonMessageEnum(Integer code,boolean success, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

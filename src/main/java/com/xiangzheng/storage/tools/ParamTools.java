package com.xiangzheng.storage.tools;

public class ParamTools {
    // UserId 加密
    public static String UserIdEncode(String id){
//        if(StringUtils.isEmpty(id)){
//            throw new NullPointerException();
//        }
        return new Hashids(Hashids.DEFAULT_SALT,10).encodeHex(id);
    }
    // UserId解密
    public static String UserIdDecode(Object id){
        return new Hashids(Hashids.DEFAULT_SALT,10).decodeHex(String.valueOf(id));
    }


    public static void main(String[] args) {
        System.out.println(UserIdEncode(12+""));
    }


}

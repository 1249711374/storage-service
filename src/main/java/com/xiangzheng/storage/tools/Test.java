package com.xiangzheng.storage.tools;


public class Test {


    public static void main(String[] args) {
        System.out.println(new Hashids(Hashids.DEFAULT_SALT,10).decodeHex("B890QL6kRM"));

    }
}

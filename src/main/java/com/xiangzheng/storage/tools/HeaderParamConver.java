//package com.xiangzheng.storage.tools;
//
//import cn.hutool.http.HttpRequest;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class HeaderParamConver {
//    public static final Integer GET = 1;
//    public static final Integer POST = 2;
//
//    public static HttpRequest paramConver(HttpServletRequest request,Integer i,String url){
//        /**
//         * 1--get 请求，2--post 请求
//         */
//        HttpRequest httpRequest = new HttpRequest(url);
//        if(i==1){
//                   httpRequest = HttpRequest.get(url).header("x-storesys-id",request.getHeader("x-storesys-id"))
//                    .header("x-access-token",request.getHeader("x-access-token"))
//                    .header("x-client-token",request.getHeader("x-client-token"))
//                    .header("x-platform",request.getHeader("x-platform"))
//                    .header("x-system-version",request.getHeader("x-system-version"))
//                    .header("x-client-version",request.getHeader("x-client-version"))
//                    .header("x-method-version",request.getHeader("x-method-version"))
//                    .header("x-network-type",request.getHeader("x-network-type"))
//                    .header("x-domain",request.getHeader("x-domain"))
//                    .header("x-visitor-mode",request.getHeader("x-visitor-mode"))
//                    .header("x-tea-id",request.getHeader("x-tea-id"));
//        }
//        if(i==2){
//             httpRequest = HttpRequest.post(url).header("x-storesys-id",request.getHeader("x-storesys-id"))
//                    .header("x-access-token",request.getHeader("x-access-token"))
//                    .header("x-client-token",request.getHeader("x-client-token"))
//                    .header("x-platform",request.getHeader("x-platform"))
//                    .header("x-system-version",request.getHeader("x-system-version"))
//                    .header("x-client-version",request.getHeader("x-client-version"))
//                    .header("x-method-version",request.getHeader("x-method-version"))
//                    .header("x-network-type",request.getHeader("x-network-type"))
//                    .header("x-domain",request.getHeader("x-domain"))
//                    .header("x-visitor-mode",request.getHeader("x-visitor-mode"))
//                    .header("x-tea-id",request.getHeader("x-tea-id"));
//        }
//        return httpRequest;
//
//    }
//}

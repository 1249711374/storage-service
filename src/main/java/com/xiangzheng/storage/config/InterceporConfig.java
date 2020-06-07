package com.xiangzheng.storage.config;

import com.xiangzheng.storage.interceptor.DataSourceHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public  class InterceporConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 拦截器按照顺序执行
         */
      //  registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/salesmanInfo/**").excludePathPatterns("/salesmanInfo/WeChatCallBack");
        registry.addInterceptor(new DataSourceHandlerInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}

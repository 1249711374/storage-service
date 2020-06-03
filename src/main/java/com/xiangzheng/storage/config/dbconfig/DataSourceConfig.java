package com.xiangzheng.storage.config.dbconfig;//package com.zhou.datasource.dbconfig;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//
//
//
//public class DataSourceConfig {
//    @Value("${spring.datasource.dynamic.datasource.mysql.driverClassName}")
//    private String driverClassName;
//    @Value("${spring.datasource.dynamic.datasource.mysql.url}")
//    private String url;
//    @Value("${spring.datasource.dynamic.datasource.mysql.username}")
//    private String username;
//    @Value("${spring.datasource.dynamic.datasource.mysql.password}")
//    private String password;
//
//    @Bean
//    public MysqlDynamicDataSourceProvider mysqlDynamicDataSourceProvider(){
//        MysqlDynamicDataSourceProvider mysqlDynamicDataSourceProvider =new MysqlDynamicDataSourceProvider(driverClassName,url,username,password);
//        return mysqlDynamicDataSourceProvider;
//    }
//
//
//
//
//}

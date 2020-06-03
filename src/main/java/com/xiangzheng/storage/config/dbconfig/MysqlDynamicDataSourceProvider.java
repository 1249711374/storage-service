package com.xiangzheng.storage.config.dbconfig;//package com.zhou.datasource.dbconfig;
//
//
//import com.baomidou.dynamic.datasource.provider.AbstractJdbcDataSourceProvider;
//import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 通过Mysql数据库获取数据源信息
// */
//
//public class MysqlDynamicDataSourceProvider extends AbstractJdbcDataSourceProvider {
//
//    public static final String mysqlDriver = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy"; // mysql数据库的驱动类
//    public static final String oracleDriver = "oracle.jdbc.OracleDriver"; // oracles数据库的驱动类
//    public static final String sql2005Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // sqlserver数据库的驱动类
//    public static final String sql2000driver = "net.sourceforge.jtds.jdbc.Driver"; // sqlserver数据库的驱动类
//
//    public MysqlDynamicDataSourceProvider(String driverClassName, String url, String username, String password) {
//        super(driverClassName, url, username, password);
//    }
//
//    @Override
//    protected Map<String, DataSourceProperty> executeStmt(Statement statement) throws SQLException {
//        Map<String, DataSourceProperty> map = new HashMap<>();
//        ResultSet rs = statement.executeQuery("select * from facts_dbconnection");
//        /**
//         * 获取信息
//         */
//        while(rs.next()){
//
//            String databaseType = rs.getString("db_type");
//
//            String driverClassName = null;
//            if (databaseType.equals("MYSQL")) {
//                driverClassName = mysqlDriver;
//            } else if (databaseType.equals("ORACLE")) {
//                driverClassName = oracleDriver;
//            } else if (databaseType.equals("SQLServer2000")) {
//                driverClassName = sql2005Driver;
//            } else if(databaseType.equals("SQLServer")) {
//                driverClassName = sql2000driver;
//            }
//
//            String url = rs.getString("db_url");
//            String username = rs.getString("db_username");
//            String password = rs.getString("db_password");
//            String key = rs.getString("db_name");
//
//            DataSourceProperty dataSourceProperty = new DataSourceProperty();
//            dataSourceProperty.setPollName(key);
//            dataSourceProperty.setDriverClassName(mysqlDriver);
//            dataSourceProperty.setUrl(url);
//            dataSourceProperty.setUsername(username);
//            dataSourceProperty.setPassword(password);
//
//            map.put(key,dataSourceProperty);
//        }
//        return map;
//    }
//}

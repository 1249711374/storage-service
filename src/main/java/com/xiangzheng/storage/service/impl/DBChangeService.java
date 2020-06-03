package com.xiangzheng.storage.service.impl;


import com.xiangzheng.storage.annotation.DBChange;
import com.xiangzheng.storage.entity.DataSource;
import com.xiangzheng.storage.entity.User;
import com.xiangzheng.storage.mapper.DataSourceMapper;
import com.xiangzheng.storage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/4/9 11:46
 * @info :
 */
@Service
public class DBChangeService {
    @Autowired
    private DataSourceMapper dataSourceMapper;
    @Autowired
    private UserMapper userMapper;

    /**
     * 使用默认数据源获取数据库中的其他数据库链接信息
     * @return
     */
    public List<DataSource> get(){
        return dataSourceMapper.get();
    }

    /**
     * 通过注解将数据源改为参数指定的。
     * @param dataSource
     * @return
     */
    @DBChange
    public List<User> getUser(@DBChange DataSource dataSource){
       return userMapper.get();
    }




}

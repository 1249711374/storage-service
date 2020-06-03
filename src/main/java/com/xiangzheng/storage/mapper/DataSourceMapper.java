package com.xiangzheng.storage.mapper;

import com.xiangzheng.storage.entity.DataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @auther zhoupan
 * @date 2019/4/8 21:12
 * @info
 */
@Mapper
public interface DataSourceMapper {

    @Select("SELECT * FROM databasetype")
    List<DataSource> get();


}

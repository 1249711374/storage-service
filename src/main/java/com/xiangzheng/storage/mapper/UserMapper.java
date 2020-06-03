package com.xiangzheng.storage.mapper;


import com.xiangzheng.storage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/4/9 11:44
 * @info :
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> get();
}

package com.xiangzheng.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/4/9 11:40
 * @info :
 */
@Getter
@Setter

public class User {
    String userName;
    String age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luozhonghua on 2018/8/12.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public int add(String name,Integer age) {
        return userMapper.insert(name,  age);
    }

    public User findUser(String name) {
        return userMapper.findByName(name);
    }



}

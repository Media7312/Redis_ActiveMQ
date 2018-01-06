package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getAllUser() throws Exception{
        try {
            return userMapper.getAllUser();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}

package com.demo.dao;

import com.demo.entiy.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> getAllUser();

    User getUserByUsername(String username);
}

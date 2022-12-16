package com.ly.admintemp.dao;

import com.ly.admintemp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginDao {
    User selectUserByUsername(@Param("username") String username, @Param("password") String password);
}

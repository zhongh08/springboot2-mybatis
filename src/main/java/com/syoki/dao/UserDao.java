package com.syoki.dao;

import com.syoki.model.User;

import java.util.List;

public interface UserDao {

    int insert(User user);

    List<User> selectUsers();

}

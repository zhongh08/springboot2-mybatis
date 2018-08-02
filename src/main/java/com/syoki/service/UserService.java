package com.syoki.service;

import com.github.pagehelper.PageInfo;
import com.syoki.model.User;

public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);

}

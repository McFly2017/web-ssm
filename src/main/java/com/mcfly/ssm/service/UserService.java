package com.mcfly.ssm.service;

import com.mcfly.ssm.model.User;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByEmail(String userEmail);

    boolean  login(String username,String UserPwd);

    boolean deleteById(Integer  id);

    boolean addUser(User user);

    boolean updateUser(User user);
}

package com.mcfly.ssm.dao;

import com.mcfly.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Repository
public interface UserDao {

    User selectUserByEmail(@Param("userEmail") String userEmail);

    User selectUser(@Param("userName") String userName);

    List<User> selectAllUser();

    boolean deleteById(Integer  id);

    boolean addUser(User user);

    boolean updateUser(User user);
}

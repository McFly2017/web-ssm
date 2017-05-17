package com.mcfly.ssm.service.impl;

import com.mcfly.ssm.dao.UserDao;
import com.mcfly.ssm.model.User;
import com.mcfly.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDao userDao;

    public User getUserByEmail(String userEmail){return userDao.selectUserByEmail(userEmail);}

    public boolean login(String username,String UserPwd){
        User user = userDao.selectUser(username);
        if (user != null && user.getUserPwd().equals(UserPwd)){
            return true;
        }else {
            return false;
        }
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
    //CRUD
    public boolean deleteById(Integer  id){
        return userDao.deleteById(id);
    }

    public boolean addUser(User user){
        return userDao.addUser(user);
    }

   public boolean updateUser(User user){
        return userDao.updateUser(user);
   }
}

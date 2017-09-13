package com.lm;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.dao.UserDao;
import com.lm.entity.UserEntity;

public class UserDaoTest extends AppTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSaveUser() throws Exception {
        UserEntity user=new UserEntity();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("xiaoming1");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
       UserEntity user= userDao.findUserByUserName("小明");
       System.out.println("user is "+user);
    }

    @Test
    public void updateUser(){
        UserEntity user=new UserEntity();
        user.setId(2l);
        user.setUserName("小红");
        user.setPassWord("小红1");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById(){
        userDao.deleteUserById(1l);
    }

}

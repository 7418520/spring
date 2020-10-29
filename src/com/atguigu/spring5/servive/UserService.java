package com.atguigu.spring5.servive;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

/**
 * Created by lilin on 2020/10/29/0029.
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void add() {
        System.out.println("service add .......");
//        原始创建对象
//        UserDao userDao=new UserDaoImpl();
      userDao.update();
    }
}

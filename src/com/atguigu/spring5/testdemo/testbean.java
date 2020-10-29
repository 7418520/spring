package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.Uer;
import com.atguigu.spring5.servive.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lilin on 2020/10/29/0029.
 */
public class testbean {
    @Test
    public void testadd()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService= context.getBean("userService",UserService.class);
        userService.add();
    }

}

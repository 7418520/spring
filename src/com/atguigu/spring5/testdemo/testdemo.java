package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.Uer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by lilin on 2020/10/29/0029.
 */
public class testdemo {
   /* @Test
    public  void testadd ()
    {
        ApplicationContext user =  new ClassPathXmlApplicationContext("bean1.xml");
        Uer uer=   user.getBean("user", Uer.class);
        System.out.println(uer);
        uer.add();
    }*/
    @Test
    public void testBook()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Book book= context.getBean("book",Book.class);
        book.testBook();
    }
    @Test
    public void testOrders()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders= context.getBean("orders",Orders.class);
        orders.testOrders();
    }
}

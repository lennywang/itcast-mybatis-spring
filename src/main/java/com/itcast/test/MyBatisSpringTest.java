package com.itcast.test;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 **/
public class MyBatisSpringTest {

    @Test
    public void testMapper() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = userMapper.findUserById(13);
        System.out.println(user);
    }
}

package com.scuhmz.device.service;

import com.scuhmz.device.Tester;
import com.scuhmz.device.model.User;
import org.junit.Test;
import org.springframework.security.core.userdetails.UserDetails;

import javax.annotation.Resource;

public class UserServiceTest extends Tester {
    @Resource
    private UserService userService;

    @Test
    public void loadUserByUsername() {
       UserDetails user =  userService.loadUserByUsername("Bob");
       System.out.println(user);
    }
}

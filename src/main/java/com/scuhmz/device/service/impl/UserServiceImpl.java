package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.UserMapper;
import com.scuhmz.device.dao.UserRoleMapper;
import com.scuhmz.device.model.User;
import com.scuhmz.device.model.dto.UserInfoDto;
import com.scuhmz.device.service.UserService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


/**
 * Created by CodeGenerator on 2019/02/17.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    UserMapper userMapper;
    @Resource
    UserRoleMapper userRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User newUser = new User();
        newUser.setUsername(username);
        User user = userMapper.selectOne(newUser);
        if (user == null) {
            throw new UsernameNotFoundException("用户名:" + username + " 不存在！");
        }
        Collection<SimpleGrantedAuthority> collection = new HashSet<SimpleGrantedAuthority>();
        Iterator<String> iterator = userRoleMapper.findUserRolesByUid(user.getId()).iterator();
        while (iterator.hasNext()) {
            collection.add(new SimpleGrantedAuthority(iterator.next()));
        }

        return new org.springframework.security.core.userdetails.User(username,user.getPassword(),collection);
    }

    @Override
    public UserInfoDto getCurrentUserInfo(Integer id) {
        return null;
    }
}

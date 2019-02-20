package com.scuhmz.device.dao;

import com.scuhmz.device.Tester;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserRoleMapperTest extends Tester {
    @Resource
    UserRoleMapper userRoleMapper;

    @Test
   public void findUserRolesByUid()
    {
        int id = 1;
        List<String> result = userRoleMapper.findUserRolesByUid(id);
        System.out.println(result.toString());
    }

}

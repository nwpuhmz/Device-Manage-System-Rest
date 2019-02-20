package com.scuhmz.device.dao;

import com.scuhmz.device.core.Mapper;
import com.scuhmz.device.model.User;
import com.scuhmz.device.model.UserRole;

import java.util.List;

public interface UserRoleMapper extends Mapper<UserRole> {

    List<String> findUserRolesByUid(int id);
}


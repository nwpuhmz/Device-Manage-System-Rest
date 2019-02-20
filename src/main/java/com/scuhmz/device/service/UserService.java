package com.scuhmz.device.service;
import com.scuhmz.device.model.User;
import com.scuhmz.device.core.Service;
import com.scuhmz.device.model.dto.UserInfoDto;
import org.springframework.security.core.userdetails.UserDetailsService;


/**
 * Created by CodeGenerator on 2019/02/17.
 */
public interface UserService extends Service<User>, UserDetailsService {
    UserInfoDto getCurrentUserInfo(Integer id);
}

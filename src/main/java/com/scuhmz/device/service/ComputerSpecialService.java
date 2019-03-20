package com.scuhmz.device.service;
import com.scuhmz.device.model.ComputerSpecial;
import com.scuhmz.device.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/02/15.
 */
public interface ComputerSpecialService extends Service<ComputerSpecial> {
    List<ComputerSpecial> findByCustomCondition(Map<String,Object> map);//根据条件查找
}

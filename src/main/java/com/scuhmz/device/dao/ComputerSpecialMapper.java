package com.scuhmz.device.dao;

import com.scuhmz.device.core.Mapper;
import com.scuhmz.device.model.ComputerSpecial;

import java.util.List;
import java.util.Map;

public interface ComputerSpecialMapper extends Mapper<ComputerSpecial> {
    List<ComputerSpecial> findByCustomCondition(Map<String,Object> map);//根据条件查找
}
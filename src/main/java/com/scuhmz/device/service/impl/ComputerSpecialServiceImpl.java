package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.ComputerSpecialMapper;
import com.scuhmz.device.model.ComputerSpecial;
import com.scuhmz.device.service.ComputerSpecialService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/15.
 */
@Service
@Transactional
public class ComputerSpecialServiceImpl extends AbstractService<ComputerSpecial> implements ComputerSpecialService {
    @Resource
    private ComputerSpecialMapper computerSpecialMapper;

}

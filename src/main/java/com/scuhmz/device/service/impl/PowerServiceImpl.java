package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.PowerMapper;
import com.scuhmz.device.model.Power;
import com.scuhmz.device.service.PowerService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class PowerServiceImpl extends AbstractService<Power> implements PowerService {
    @Resource
    private PowerMapper powerMapper;

}

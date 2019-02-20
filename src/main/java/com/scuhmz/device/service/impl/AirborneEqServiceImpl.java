package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.AirborneEqMapper;
import com.scuhmz.device.model.AirborneEq;
import com.scuhmz.device.service.AirborneEqService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class AirborneEqServiceImpl extends AbstractService<AirborneEq> implements AirborneEqService {
    @Resource
    private AirborneEqMapper airborneEqMapper;

}

package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.RtrMapper;
import com.scuhmz.device.model.Rtr;
import com.scuhmz.device.service.RtrService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class RtrServiceImpl extends AbstractService<Rtr> implements RtrService {
    @Resource
    private RtrMapper rtrMapper;

}

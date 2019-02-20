package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.NetdeviceSpecailMapper;
import com.scuhmz.device.model.NetdeviceSpecail;
import com.scuhmz.device.service.NetdeviceSpecailService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class NetdeviceSpecailServiceImpl extends AbstractService<NetdeviceSpecail> implements NetdeviceSpecailService {
    @Resource
    private NetdeviceSpecailMapper netdeviceSpecailMapper;

}

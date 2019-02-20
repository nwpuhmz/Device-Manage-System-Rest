package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.ComputerInboundMapper;
import com.scuhmz.device.model.ComputerInbound;
import com.scuhmz.device.service.ComputerInboundService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/15.
 */
@Service
@Transactional
public class ComputerInboundServiceImpl extends AbstractService<ComputerInbound> implements ComputerInboundService {
    @Resource
    private ComputerInboundMapper computerInboundMapper;

}

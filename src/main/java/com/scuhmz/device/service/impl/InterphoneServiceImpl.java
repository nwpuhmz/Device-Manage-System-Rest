package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.InterphoneMapper;
import com.scuhmz.device.model.Interphone;
import com.scuhmz.device.service.InterphoneService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class InterphoneServiceImpl extends AbstractService<Interphone> implements InterphoneService {
    @Resource
    private InterphoneMapper interphoneMapper;

}

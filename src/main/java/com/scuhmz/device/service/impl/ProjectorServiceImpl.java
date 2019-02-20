package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.ProjectorMapper;
import com.scuhmz.device.model.Projector;
import com.scuhmz.device.service.ProjectorService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class ProjectorServiceImpl extends AbstractService<Projector> implements ProjectorService {
    @Resource
    private ProjectorMapper projectorMapper;

}

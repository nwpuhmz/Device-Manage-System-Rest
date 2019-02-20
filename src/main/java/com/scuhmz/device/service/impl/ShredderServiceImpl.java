package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.ShredderMapper;
import com.scuhmz.device.model.Shredder;
import com.scuhmz.device.service.ShredderService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class ShredderServiceImpl extends AbstractService<Shredder> implements ShredderService {
    @Resource
    private ShredderMapper shredderMapper;

}

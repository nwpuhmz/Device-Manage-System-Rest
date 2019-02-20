package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.DisplayTvMapper;
import com.scuhmz.device.model.DisplayTv;
import com.scuhmz.device.service.DisplayTvService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class DisplayTvServiceImpl extends AbstractService<DisplayTv> implements DisplayTvService {
    @Resource
    private DisplayTvMapper displayTvMapper;

}

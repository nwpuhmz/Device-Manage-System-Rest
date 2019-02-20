package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.AntennaMapper;
import com.scuhmz.device.model.Antenna;
import com.scuhmz.device.service.AntennaService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class AntennaServiceImpl extends AbstractService<Antenna> implements AntennaService {
    @Resource
    private AntennaMapper antennaMapper;

}

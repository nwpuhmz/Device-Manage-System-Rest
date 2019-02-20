package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.SquareCarMapper;
import com.scuhmz.device.model.SquareCar;
import com.scuhmz.device.service.SquareCarService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class SquareCarServiceImpl extends AbstractService<SquareCar> implements SquareCarService {
    @Resource
    private SquareCarMapper squareCarMapper;

}

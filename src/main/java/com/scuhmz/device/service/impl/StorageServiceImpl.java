package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.StorageMapper;
import com.scuhmz.device.model.Storage;
import com.scuhmz.device.service.StorageService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class StorageServiceImpl extends AbstractService<Storage> implements StorageService {
    @Resource
    private StorageMapper storageMapper;

}

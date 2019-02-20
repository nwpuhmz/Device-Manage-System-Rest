package com.scuhmz.device.service.impl;

import com.scuhmz.device.dao.UsbkeyMapper;
import com.scuhmz.device.model.Usbkey;
import com.scuhmz.device.service.UsbkeyService;
import com.scuhmz.device.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/02/20.
 */
@Service
@Transactional
public class UsbkeyServiceImpl extends AbstractService<Usbkey> implements UsbkeyService {
    @Resource
    private UsbkeyMapper usbkeyMapper;

}

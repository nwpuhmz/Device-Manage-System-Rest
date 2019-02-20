package com.scuhmz.device.web;
import com.scuhmz.device.core.Result;
import com.scuhmz.device.core.ResultGenerator;
import com.scuhmz.device.model.NetdeviceSpecail;
import com.scuhmz.device.service.NetdeviceSpecailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/02/20.
*/
@RestController
@RequestMapping("/netdevice/specail")
public class NetdeviceSpecailController {
    @Resource
    private NetdeviceSpecailService netdeviceSpecailService;

    @PostMapping("/add")
    public Result add(NetdeviceSpecail netdeviceSpecail) {
        netdeviceSpecailService.save(netdeviceSpecail);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        netdeviceSpecailService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(NetdeviceSpecail netdeviceSpecail) {
        netdeviceSpecailService.update(netdeviceSpecail);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        NetdeviceSpecail netdeviceSpecail = netdeviceSpecailService.findById(id);
        return ResultGenerator.genSuccessResult(netdeviceSpecail);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<NetdeviceSpecail> list = netdeviceSpecailService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

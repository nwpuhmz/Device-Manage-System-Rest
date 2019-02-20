package com.scuhmz.device.web;
import com.scuhmz.device.core.Result;
import com.scuhmz.device.core.ResultGenerator;
import com.scuhmz.device.model.Usbkey;
import com.scuhmz.device.service.UsbkeyService;
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
@RequestMapping("/usbkey")
public class UsbkeyController {
    @Resource
    private UsbkeyService usbkeyService;

    @PostMapping("/add")
    public Result add(Usbkey usbkey) {
        usbkeyService.save(usbkey);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        usbkeyService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Usbkey usbkey) {
        usbkeyService.update(usbkey);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Usbkey usbkey = usbkeyService.findById(id);
        return ResultGenerator.genSuccessResult(usbkey);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Usbkey> list = usbkeyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

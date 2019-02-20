package com.scuhmz.device.web;
import com.scuhmz.device.core.Result;
import com.scuhmz.device.core.ResultGenerator;
import com.scuhmz.device.model.Interphone;
import com.scuhmz.device.service.InterphoneService;
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
@RequestMapping("/interphone")
public class InterphoneController {
    @Resource
    private InterphoneService interphoneService;

    @PostMapping("/add")
    public Result add(Interphone interphone) {
        interphoneService.save(interphone);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        interphoneService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Interphone interphone) {
        interphoneService.update(interphone);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Interphone interphone = interphoneService.findById(id);
        return ResultGenerator.genSuccessResult(interphone);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Interphone> list = interphoneService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

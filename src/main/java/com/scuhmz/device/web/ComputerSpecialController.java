package com.scuhmz.device.web;
import com.scuhmz.device.core.Result;
import com.scuhmz.device.core.ResultGenerator;
import com.scuhmz.device.model.ComputerSpecial;
import com.scuhmz.device.service.ComputerSpecialService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/02/15.
*/
@RestController
@RequestMapping("/computer/special")
public class ComputerSpecialController {
    @Resource
    private ComputerSpecialService computerSpecialService;

    @PostMapping("/add")
    public Result add(ComputerSpecial computerSpecial) {
        computerSpecialService.save(computerSpecial);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        computerSpecialService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ComputerSpecial computerSpecial) {
        computerSpecialService.update(computerSpecial);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ComputerSpecial computerSpecial = computerSpecialService.findById(id);
        return ResultGenerator.genSuccessResult(computerSpecial);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ComputerSpecial> list = computerSpecialService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

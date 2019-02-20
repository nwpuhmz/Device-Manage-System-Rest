package com.scuhmz.device.web;
import com.scuhmz.device.core.Result;
import com.scuhmz.device.core.ResultGenerator;
import com.scuhmz.device.model.Shredder;
import com.scuhmz.device.service.ShredderService;
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
@RequestMapping("/shredder")
public class ShredderController {
    @Resource
    private ShredderService shredderService;

    @PostMapping("/add")
    public Result add(Shredder shredder) {
        shredderService.save(shredder);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        shredderService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Shredder shredder) {
        shredderService.update(shredder);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Shredder shredder = shredderService.findById(id);
        return ResultGenerator.genSuccessResult(shredder);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Shredder> list = shredderService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

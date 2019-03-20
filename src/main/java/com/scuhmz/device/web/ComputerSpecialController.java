package com.scuhmz.device.web;
import com.scuhmz.device.core.Result;
import com.scuhmz.device.core.ResultGenerator;
import com.scuhmz.device.model.ComputerSpecial;
import com.scuhmz.device.service.ComputerSpecialService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Created by CodeGenerator on 2019/02/15.
*/
@RestController
@RequestMapping("/computer/special")
public class ComputerSpecialController {
    @Resource
    private ComputerSpecialService computerSpecialService;

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

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
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,@RequestParam(defaultValue = "") String unifiedNum) {
        PageHelper.startPage(page, size);
        List<ComputerSpecial> list ;
        if (unifiedNum=="") {
            list = computerSpecialService.findAll();
        }
        else{
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("unifiedNum",unifiedNum);
            list = computerSpecialService.findByCustomCondition(map);
        }
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

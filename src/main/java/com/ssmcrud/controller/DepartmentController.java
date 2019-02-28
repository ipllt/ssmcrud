package com.ssmcrud.controller;

import com.ssmcrud.bean.Department;
import com.ssmcrud.bean.Msg;
import com.ssmcrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理和部门有关的请求
 * @author ipllt
 * @create 2019-02-27 下午 4:38
 */

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /*返回所有部门信息*/
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts",list);
    }

}

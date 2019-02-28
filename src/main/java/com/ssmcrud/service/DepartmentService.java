package com.ssmcrud.service;

import com.ssmcrud.bean.Department;
import com.ssmcrud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ipllt
 * @create 2019-02-27 下午 4:39
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {

        List<Department> list = departmentMapper.selectByExample(null);

        return list;
    }
}

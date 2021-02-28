package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {

        log.info("save Department inside method");
        return departmentService.save(department);
    }


    @GetMapping("{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId) {

        log.info("Get Department inside method");
        return departmentService.findByDepartmentId(departmentId);
    }

}

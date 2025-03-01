package com.example.Springbootwith_mysql.controller;

import com.example.Springbootwith_mysql.entity.Department;
import com.example.Springbootwith_mysql.entity.DepartmentDto;
import com.example.Springbootwith_mysql.service.DepartmentService;
import com.example.Springbootwith_mysql.serviceimpl.DepartmentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

   private DepartmentService departmentService;
//    @GetMapping
//    public String hello(){
//        return "hello welcome user";
//    }

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAllDepartments(){
       // departmentService = new DepartmentServiceimpl();
        List<DepartmentDto> departmentlist = departmentService.getAllDepartment();
        return  ResponseEntity.ok(departmentlist);
    }
    @PostMapping
    public ResponseEntity<DepartmentDto>  createDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto department = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }


}

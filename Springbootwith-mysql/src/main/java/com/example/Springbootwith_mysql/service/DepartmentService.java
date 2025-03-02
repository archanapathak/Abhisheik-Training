package com.example.Springbootwith_mysql.service;

import com.example.Springbootwith_mysql.entity.Department;
import com.example.Springbootwith_mysql.entity.DepartmentDto;
import com.example.Springbootwith_mysql.entity.DepartmentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DepartmentService {
    List<DepartmentDto> getAllDepartment();
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(Long departmentId);

    DepartmentDto updateDepartment(Long departmentId, DepartmentDto updatedDepartment);
    void deleteDepartment(Long departmentId);
}

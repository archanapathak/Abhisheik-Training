package com.example.Springbootwith_mysql.serviceimpl;

import com.example.Springbootwith_mysql.entity.Department;
import com.example.Springbootwith_mysql.entity.DepartmentDto;
import com.example.Springbootwith_mysql.entity.DepartmentMapper;
import com.example.Springbootwith_mysql.repository.DepartmentJpaRepository;
import com.example.Springbootwith_mysql.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class DepartmentServiceimpl implements DepartmentService {
    @Autowired
    DepartmentJpaRepository departmentJpaRepository;

    public DepartmentServiceimpl(DepartmentJpaRepository departmentJpaRepository) {
        this.departmentJpaRepository = departmentJpaRepository;
    }

    @Override
    public List<DepartmentDto> getAllDepartment() {
        List<Department> deparments = departmentJpaRepository.findAll();
        List<DepartmentDto> departmentlist = deparments.stream().map((department) ->
                DepartmentMapper.mapToDepartmentDto(department)).collect(Collectors.toList());

        return departmentlist;
    }

    public DepartmentDto createDepartment(DepartmentDto departmentDto){
        Department department =  DepartmentMapper.mapToDepartment(departmentDto);
        Department saveddepartment  =   departmentJpaRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(saveddepartment);
    }
}

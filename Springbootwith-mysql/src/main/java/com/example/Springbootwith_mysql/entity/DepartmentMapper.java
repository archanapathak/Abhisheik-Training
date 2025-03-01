package com.example.Springbootwith_mysql.entity;

public class DepartmentMapper {

    public static DepartmentDto mapToDepartmentDto(Department department){

        return new DepartmentDto(department.getId(),department.getDepartment_name(),
                department.getDepartment_description());
    }

    public static Department mapToDepartment(DepartmentDto departmentDto){
        return  new Department(departmentDto.getId(),departmentDto.getDepartmentname(),
                departmentDto.getDepartmentdescription());
    }
}

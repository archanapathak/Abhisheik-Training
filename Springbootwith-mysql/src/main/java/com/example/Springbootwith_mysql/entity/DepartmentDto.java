package com.example.Springbootwith_mysql.entity;

public class DepartmentDto {
    private Long id;
    private String departmentname;
    private String departmentdescription;


    public DepartmentDto() {
    }

    public DepartmentDto(Long id, String departmentname, String departmentdescription) {
        this.id = id;
        this.departmentname = departmentname;
        this.departmentdescription = departmentdescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentdescription() {
        return departmentdescription;
    }

    public void setDepartmentdescription(String departmentdescription) {
        this.departmentdescription = departmentdescription;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    @Override
    public String toString() {
        return "DepartmentDto{" +
                "id=" + id +
                ", departmentname='" + departmentname + '\'' +
                ", departmentdescription='" + departmentdescription + '\'' +
                '}';
    }
}

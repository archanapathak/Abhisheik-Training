package com.example.Springbootwith_mysql.entity;


import jakarta.persistence.*;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "department_name")
    private  String department_name;
    @Column(name = "department_description")
    private String department_description;

    public Department() {
    }

    public Department(Long id, String department_description, String department_name) {
        this.id = id;
        this.department_description = department_description;
        this.department_name = department_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_description() {
        return department_description;
    }

    public void setDepartment_description(String department_description) {
        this.department_description = department_description;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department_name='" + department_name + '\'' +
                ", department_description='" + department_description + '\'' +
                '}';
    }
}

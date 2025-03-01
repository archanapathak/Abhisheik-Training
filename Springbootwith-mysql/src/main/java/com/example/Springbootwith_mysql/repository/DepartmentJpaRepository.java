package com.example.Springbootwith_mysql.repository;

import com.example.Springbootwith_mysql.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentJpaRepository extends JpaRepository<Department,Long> {
}

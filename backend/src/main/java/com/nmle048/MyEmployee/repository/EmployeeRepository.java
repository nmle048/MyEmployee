package com.nmle048.MyEmployee.repository;

import com.nmle048.MyEmployee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    boolean existsByPersonId(String personId);
}

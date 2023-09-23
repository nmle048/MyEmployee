package com.nmle048.MyEmployee.repository;

import com.nmle048.MyEmployee.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
}

package com.nmle048.MyEmployee.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "departments")
@Data
public class DepartmentEntity {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "departmentEntity")
    private List<EmployeeEntity> employeeEntities;

    @OneToMany(mappedBy = "departmentEntity")
    private List<PositionEntity> positionEntities;
}

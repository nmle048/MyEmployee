package com.nmle048.MyEmployee.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "positions")
@Data
public class PositionEntity {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "positionEntity")
    private List<EmployeeEntity> employeeEntities;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;
}

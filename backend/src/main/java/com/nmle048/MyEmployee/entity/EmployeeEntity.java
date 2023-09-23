package com.nmle048.MyEmployee.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private int id;

    private String fullName;

    private boolean isMale;

    private String personId;

    private LocalDate dob;

    private String nativePlace;

    private String permanentPlace;

    private LocalDate issueDate;

    private String issuePlace;

    private LocalDate startDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private PositionEntity positionEntity;
}

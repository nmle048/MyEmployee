package com.nmle048.MyEmployee.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class EmployeeModel extends RepresentationModel<EmployeeModel> {
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

    private DepartmentModel departmentModel;

    private PositionModel positionModel;
}

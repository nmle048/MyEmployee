package com.nmle048.MyEmployee.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode(callSuper = false)
public class DepartmentModel extends RepresentationModel<DepartmentModel> {

    private int id;

    private String name;
}

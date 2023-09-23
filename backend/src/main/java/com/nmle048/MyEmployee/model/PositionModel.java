package com.nmle048.MyEmployee.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode(callSuper = false)
public class PositionModel extends RepresentationModel<PositionModel> {

    private int id;

    private String name;
}

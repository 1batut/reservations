package ru.tavan.batut.reservations.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by van on 17.12.16.
 */

@ApiModel(
        value = "Authenticated user",
        description = "Represents information about authenticated user"
)
public class Person {

    @ApiModelProperty(notes = "First name")
    private String firstName;

    @ApiModelProperty(notes = "Last name")
    private String lastName;

    @ApiModelProperty(notes = "Email")
    private String email;

    @ApiModelProperty(notes = "Phone")
    private String phone;

    @ApiModelProperty(notes = "Birth date")
    private String birthDate;

    @ApiModelProperty(notes = "the roles applied to the user")
    private List<String> roles;
}

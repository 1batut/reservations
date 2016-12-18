package ru.tavan.batut.reservations.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by van on 18.12.16.
 */
@ApiModel(
        value = "Single reservation record",
        description = "Represents information about single reservation record"
)
public class Reservation {
    @ApiModelProperty(notes = "Reservation start time")
    private Date startTime;

    @ApiModelProperty(notes = "Reservation owner(sportsmen, coach, event organizer)")
    private Person owner;

    @ApiModelProperty(notes = "Number of attendants for this reservation")
    private int numOfAttendants;

    @ApiModelProperty(notes = "Reservation type(general, private, couple, party, coach, maintenance)")
    private ReservationType reservationType;

    @ApiModelProperty(notes = "Is this reservation actually attended")
    private boolean isAttended;





}

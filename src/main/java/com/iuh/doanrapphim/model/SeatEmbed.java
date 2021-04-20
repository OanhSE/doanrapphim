package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.ToString;
import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Value
@Embeddable
@ToString
@JsonIgnoreProperties
class SeatEmbed implements Serializable {


    private static final long serialVersionUID = 2180590844906836039L;
    @ManyToOne
    @JoinColumn
    private Seat row;
    private Integer seat;


}

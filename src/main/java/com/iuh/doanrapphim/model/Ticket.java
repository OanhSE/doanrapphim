package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Ticket {

    //private static final long serialVersionUID = -4861848223523201823L;
    @Id
    @GeneratedValue
    private Long id;
    private Date time;
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private FilmSession filmSession;


    private double price;
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private User user;

    @Embedded
    private SeatEmbed seat;
}

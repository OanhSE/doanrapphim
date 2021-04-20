package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode
public class Hall {

   // private static final long serialVersionUID = -2686275439870995465L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Cinema cinema;
    @OneToMany(mappedBy = "hall")
    @JsonManagedReference
    private Set<Seat> seats;
    @OneToMany(mappedBy = "hall")
    @JsonManagedReference
    private Set<FilmSession> filmSessions;
    private int status;

}

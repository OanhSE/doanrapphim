package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode
public class FilmSession {

   // private static final long serialVersionUID = -3042040125774339580L;

    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "film_id")
    @JsonBackReference
    private Film film;
    @ManyToOne
    @JoinColumn(name = "hall_id")
    @JsonBackReference
    private Hall hall;

    @OneToMany(mappedBy = "filmSession")
    @JsonManagedReference
    private Set<Ticket> tickets;

}

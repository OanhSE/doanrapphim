package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Cinema  {

    //private static final long serialVersionUID = -7073560143632038609L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "address_id")
    @JsonBackReference
    private Address address;
    @OneToMany(mappedBy = "cinema")
    @JsonManagedReference
    private Set<Hall> halls;
    private int area;



}

package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode
public class Address  {

    //private static final long serialVersionUID = -6177124736834382658L;
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String state;
    private String country;
    @OneToMany(mappedBy = "address")
    @JsonManagedReference
    private List<Cinema> cinemas;



}

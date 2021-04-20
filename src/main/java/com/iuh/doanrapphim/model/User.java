package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Data
@Entity
public class User {

//    private static final long serialVersionUID = 8066282440283882028L;
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String phone;
    private String pwd;
    private String role;
    private String name;
    private String sex;
    private Date dayOfBirth;
    private int active = 1;
    private boolean status; //0 logout, 1 logged in
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private Set<Ticket> tickets;
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Discount discount;

}

package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties
public class Discount  {

    //private static final long serialVersionUID = -3153550691306161756L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private double percent;
    @OneToMany(mappedBy = "discount")
    private Set<User> users;

}

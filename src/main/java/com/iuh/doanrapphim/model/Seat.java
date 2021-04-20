package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode
public class Seat  {

  //  private static final long serialVersionUID = -9024270204140641442L;
    @Id
    @GeneratedValue
    private Long id;
    private String rowIndex;
    private String columnIndex;
    @ManyToOne
    @JoinColumn
    private Hall hall;
    //private String loaiGhe;

}

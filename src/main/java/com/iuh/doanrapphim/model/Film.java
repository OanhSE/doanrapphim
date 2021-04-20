package com.iuh.doanrapphim.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode
public class Film  {

    //private static final long serialVersionUID = 1267633717398146514L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int duration;
    private String genres;
    private String actor;
    private String year;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startFrom;
    private String category;
    private String language;
    private String description;
    private byte[] image;
    private String urltrailer;
    private int status; // 0 deleted 1 active
    private int retriction;
    @OneToMany(mappedBy = "film")
    private List<FilmSession> filmSession;


}

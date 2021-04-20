package com.iuh.doanrapphim.repository;

import com.iuh.doanrapphim.model.Film;
import com.iuh.doanrapphim.model.FilmSession;
import com.iuh.doanrapphim.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FilmSessionRepository extends JpaRepository<FilmSession, Long> {

    FilmSession findByFilmAndHallId(Film film, Hall hall);

    List<FilmSession> findByDateAndAndHall(Date date, Hall hall);

}

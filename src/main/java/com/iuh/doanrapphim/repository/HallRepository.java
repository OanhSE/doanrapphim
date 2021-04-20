package com.iuh.doanrapphim.repository;

import com.iuh.doanrapphim.model.Cinema;
import com.iuh.doanrapphim.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {

    public List<Hall> findByCinema(Cinema cinema);
}

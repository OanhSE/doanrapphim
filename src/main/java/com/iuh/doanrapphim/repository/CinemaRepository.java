package com.iuh.doanrapphim.repository;

import com.iuh.doanrapphim.model.Address;
import com.iuh.doanrapphim.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    List<Cinema> getCinemaByAddress(Address address);

}

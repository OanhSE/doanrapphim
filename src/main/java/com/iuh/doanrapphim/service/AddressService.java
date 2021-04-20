package com.iuh.doanrapphim.service;

import com.iuh.doanrapphim.model.Address;

import java.util.List;

public interface AddressService {

    Address add(Address address);

    List<Address> getAll();

    String delete(Long id);

    Address getCinemaById(Long id);

}

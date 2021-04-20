package com.iuh.doanrapphim.service.impl;

import com.iuh.doanrapphim.model.Address;
import com.iuh.doanrapphim.repository.AddressRepository;
import com.iuh.doanrapphim.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address add(Address address) {
        addressRepository.save(address);
        return address;
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public String delete(Long id) {
        if(getCinemaById(id)!=null){
            addressRepository.deleteById(id);
            return "SUCCESS";
        }

        return "FAILURE";
    }

    @Override
    public Address getCinemaById(Long id) {

        return addressRepository.getOne(id);
    }
}

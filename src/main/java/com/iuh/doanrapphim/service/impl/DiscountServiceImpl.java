package com.iuh.doanrapphim.service.impl;

import com.iuh.doanrapphim.model.Discount;
import com.iuh.doanrapphim.repository.DiscountRepository;
import com.iuh.doanrapphim.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public List<Discount> getAllDiscount() {
        return discountRepository.findAll();
    }

    @Override
    public Discount getDiscountByID(Long id) {
        return discountRepository.findById(id).get();
    }

    @Override
    public String deleteDiscountByID(Long id) {
        if (getDiscountByID(id) != null) {
            discountRepository.deleteById(id);
            return "SUCCESS";
        }
        return "FAILURE";
    }

    @Override
    public Discount addDiscount(Discount discount) {
        discountRepository.save(discount);
        return discount;
    }
}

package com.iuh.doanrapphim.service;

import com.iuh.doanrapphim.model.Discount;

import java.util.List;

public interface DiscountService {

    List<Discount> getAllDiscount();

    Discount getDiscountByID(Long id);

    String deleteDiscountByID(Long id);

    Discount addDiscount(Discount discount);
}

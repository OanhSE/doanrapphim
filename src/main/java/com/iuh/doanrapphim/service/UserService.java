package com.iuh.doanrapphim.service;

import com.iuh.doanrapphim.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    List<User> findByPhone(String telephone);

    User findById(Long id);

    String delete(Long id);

    void update(User user);

    User add(User user);

    List<User> findByRoleAndActive(String quyen, int kichHoat);

    User login(String email, String pwd);

    boolean checkDetail(String phone, String email);

    String logOut(User user);
}

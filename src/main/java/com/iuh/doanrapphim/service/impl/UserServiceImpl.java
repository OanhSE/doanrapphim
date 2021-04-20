package com.iuh.doanrapphim.service.impl;
import com.iuh.doanrapphim.model.User;
import com.iuh.doanrapphim.repository.UserRepository;
import com.iuh.doanrapphim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User nguoiDung) {

        if (checkDetail(nguoiDung.getPhone(), nguoiDung.getEmail())){
            userRepository.save(nguoiDung);
            return nguoiDung;
        }
        return null;
    }

    @Override
    public User login(String email, String pwd) {
        User user = userRepository.findByEmailAndPwd(email, pwd);
        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByPhone(String sdt) {
        return userRepository.findByPhoneContaining(sdt);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public String delete(Long id) {
        User user = findById(id);
        user.setActive(2);
        userRepository.saveAndFlush(user);
        return "Success";
    }

    @Override
    public void update(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> findByRoleAndActive(String role, int active) {
        return userRepository.findByRoleAndActive(role, active);
    }

    public boolean checkDetail(String phone, String email) {
        if (userRepository.findByPhoneAndEmail(email, phone) != null) {
            return false;
        }
        return true;
    }

    @Override
    public String logOut(User user) {
        User user1 = findById(user.getId());
        if (user1.equals(user)){
            user1.setStatus(false);
            return "Logged Out";
        }
        return "Failure";
    }


}

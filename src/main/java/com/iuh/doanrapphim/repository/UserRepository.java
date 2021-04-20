package com.iuh.doanrapphim.repository;

import com.iuh.doanrapphim.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    List<User> findByPhoneContaining(String phone);

    User findByEmailAndPwd(String email, String pwd);

    List<User> findByRoleAndActive(String role, int active);

    User findByPhoneAndEmail(String phone, String email);
}

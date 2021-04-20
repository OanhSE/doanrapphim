package com.iuh.doanrapphim.controller;

import com.iuh.doanrapphim.model.User;
import com.iuh.doanrapphim.service.DiscountService;
import com.iuh.doanrapphim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiscountService discountService;

    //    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @PostMapping("/login")
    public User login(@RequestBody String email, @RequestBody String pwd) {
        return userService.login(email, pwd);
    }

    @PostMapping("/signup")
    public User insert(@RequestBody User nguoiDung) {
        return userService.add(nguoiDung);
    }

    @PostMapping("/logout")
    public String logOut(@Valid @RequestBody User user){
        return userService.logOut(user);
    }

    @GetMapping("/customer/{phone}")
    public List<User> findByPhone(@PathVariable("phone") String phone) {
        return userService.findByPhone(phone);
    }

    @GetMapping("/customers")
    public List<User> getUsers() {
        return userService.findByRoleAndActive("nguoi dung", 1);
    }

    @DeleteMapping("/customers/{id}")
    public String deleteById(@PathVariable("id") Long id){

        return userService.delete(id);
    }

    @PostMapping("/customers/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }


}

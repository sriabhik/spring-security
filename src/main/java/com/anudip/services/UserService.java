package com.anudip.services;

import com.anudip.entities.User;
import com.anudip.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired

    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User add(User user){
        User s = new User();
        System.out.println("user name  : "+user.getName());
        s.setName(user.getName());
        s.setEmail(user.getEmail());
        s.setPassword(this.passwordEncoder.encode(user.getPassword()));
        return this.userRepo.save(s);
    }
    public User getUserById(int id){
        return this.userRepo.findById(id).get();
    }
}

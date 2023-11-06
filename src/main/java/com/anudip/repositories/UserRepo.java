package com.anudip.repositories;

import com.anudip.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
        User findByEmail(String email);
}

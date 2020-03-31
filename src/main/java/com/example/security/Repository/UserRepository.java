package com.example.security.Repository;

import com.example.security.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);


}

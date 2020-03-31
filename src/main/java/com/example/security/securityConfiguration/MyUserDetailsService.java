package com.example.security.securityConfiguration;

import com.example.security.Model.User;
import com.example.security.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserPrinciple loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =repo.findByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException(("404 error"));
        }

        return new UserPrinciple(user);
    }
}

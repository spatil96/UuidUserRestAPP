package com.uuidcheck.uuiduser.Service;

import com.uuidcheck.uuiduser.Entity.User;
import com.uuidcheck.uuiduser.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public User getUserByID(UUID id) {
        return userRepo.findById(id).orElse(null);
    }

    public User adduser(User user) {
       return userRepo.save(user);
    }

    public User patchuser(UUID id,User user) {
        User u = userRepo.findById(id).orElse(null);
        assert u != null;
        System.out.println(u.toString());
        u.setName(user.getName());
        u.setAddress(user.getAddress());
        return userRepo.save(u);
    }
}

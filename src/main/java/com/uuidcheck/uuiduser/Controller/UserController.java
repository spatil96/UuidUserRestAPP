package com.uuidcheck.uuiduser.Controller;

import com.uuidcheck.uuiduser.Entity.User;
import com.uuidcheck.uuiduser.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        System.out.println("getALlUsers---------------------");
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable UUID id){
        System.out.println("result came here with id"+id);
        return new ResponseEntity<>(userService.getUserByID(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.adduser(user), HttpStatus.CREATED);
    }
}

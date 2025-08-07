package com.tulioanesio.crud_spring.controllers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.tulioanesio.crud_spring.dtos.ProductDTO;
import com.tulioanesio.crud_spring.model.User;
import com.tulioanesio.crud_spring.repositories.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping
    public ResponseEntity getAll() {
        List<User> listUsers = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listUsers);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable(value = "id") Integer id){
        Optional user = repository.findById(id);

        if(user.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

        return ResponseEntity.status(HttpStatus.FOUND).body(user.get());
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody ProductDTO dto) {
        var user = new User();
        BeanUtils.copyProperties(dto, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable(value = "id") Integer id){
        Optional<User> user = repository.findById(id);

        if(user.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

        repository.delete(user.get());

        return ResponseEntity.status(HttpStatus.OK).body("User deleted successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable(value = "id") Integer id, @RequestBody ProductDTO dto){
        Optional<User> user = repository.findById(id);

        if(user.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

        var userModel = user.get();
        BeanUtils.copyProperties(dto, userModel);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(userModel));
    }
}

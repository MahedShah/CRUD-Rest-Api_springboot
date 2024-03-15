package com.example.live.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<com.example.live.user.User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public com.example.live.user.User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    public User createUSer(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        com.example.live.user.User existinguser = userRepository.findById(id).get();
        existinguser.setName(user.getName());
        existinguser.setEmail(user.getEmail());
        return userRepository.save(existinguser);
    }

    @SuppressWarnings("null")
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        try {
            userRepository.findById(id).get();
            userRepository.deleteById(id);
            return "USer deleted Successfully";
        } catch (Exception e) {
            // TODO: handle exception
            return "User not found";
        }
    }

}
package com.example.tourly.controller;
import com.example.tourly.exception.EmailNotFoundException;
import com.example.tourly.exception.UserNotFoundException;
import com.example.tourly.model.Destination;
import com.example.tourly.model.User;
import com.example.tourly.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


    @CrossOrigin("http://localhost:3000")
    @RestController
    public class UserController {

        @Autowired
        private UserRepository userRepository;

        @PostMapping("/user")
        public User newUser(@RequestBody User newUser) {
            return userRepository.save(newUser);
        }


        @GetMapping("/users")
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }


        @GetMapping("/email/{email}")
        public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
            Optional<User> user = Optional.ofNullable(userRepository.findByEmail(email));
            return user.map(ResponseEntity::ok)
                    .orElseThrow(() -> new EmailNotFoundException(email));
        }

        @GetMapping("/username/{username}")
        public ResponseEntity<?> getUserByUsername(@PathVariable String username) {
            List<User> users = userRepository.findAllByUsername(username);
            if(users.isEmpty()) {
                throw new UserNotFoundException(username);
            } else if(users.size() > 1) {
                // Handle multiple users found with the same username
                return ResponseEntity.status(HttpStatus.CONFLICT).body("Multiple users found with the same username");
            } else {
                return ResponseEntity.ok(users.get(0));
            }
        }


    }
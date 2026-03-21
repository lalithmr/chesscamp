package com.chessiq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RegistrationController {


@GetMapping("/test")
public String test() {
    return "Backend working 🚀";
}

@PostMapping("/register")
public ResponseEntity<?> registerUser(@RequestBody Map<String, String> user) {

    String username = user.get("username");
    String email = user.get("email");
    String password = user.get("password");

    if (username == null || email == null || password == null) {
        return ResponseEntity.badRequest().body("Missing fields");
    }

    Map<String, String> response = new HashMap<>();
    response.put("message", "User registered successfully");
    response.put("username", username);

    return ResponseEntity.ok(response);
}


}

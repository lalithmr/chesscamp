package com.chessiq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // allow frontend (change later to your domain)
public class RegistrationController {


// ✅ Test endpoint
@GetMapping("/test")
public String test() {
    return "Backend working 🚀";
}

// ✅ Registration endpoint (matches your frontend form)
@PostMapping("/register")
public ResponseEntity<?> registerUser(@RequestBody Map<String, Object> user) {

    String studentName = (String) user.get("studentName");
    Integer age = user.get("age") != null ? (Integer) user.get("age") : null;
    String parentName = (String) user.get("parentName");
    String phone = (String) user.get("phone");
    String email = (String) user.get("email");
    String level = (String) user.get("level");
    String batch = (String) user.get("batch");
    String hasChessSet = (String) user.get("hasChessSet");
    String needsPremiumChessSet = (String) user.get("needsPremiumChessSet");

    // 🔍 Validation
    if (studentName == null || email == null) {
        return ResponseEntity.badRequest().body("Missing required fields");
    }

    // ✅ Log data (for now)
    System.out.println("New Registration:");
    System.out.println("Student: " + studentName);
    System.out.println("Age: " + age);
    System.out.println("Parent: " + parentName);
    System.out.println("Phone: " + phone);
    System.out.println("Email: " + email);
    System.out.println("Level: " + level);
    System.out.println("Batch: " + batch);
    System.out.println("Has Chess Set: " + hasChessSet);
    System.out.println("Needs Premium Set: " + needsPremiumChessSet);

    // ✅ Response
    Map<String, String> response = new HashMap<>();
    response.put("message", "Registration successful 🚀");
    response.put("studentName", studentName);

    return ResponseEntity.ok(response);
}


}

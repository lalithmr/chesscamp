package com.chessiq.controller;

import com.chessiq.model.Registration;
import com.chessiq.repository.RegistrationRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // 🔥 allow frontend
public class RegistrationController {


private final RegistrationRepository repository;

// ✅ Constructor Injection
public RegistrationController(RegistrationRepository repository) {
    this.repository = repository;
}

// ✅ Test API
@GetMapping("/test")
public String test() {
    return "Backend working 🚀";
}

// ✅ SAVE registration (called from frontend form)
@PostMapping("/register")
public ResponseEntity<?> registerUser(@RequestBody Registration reg) {

    repository.save(reg);

    return ResponseEntity.ok("Registration saved successfully 🚀");
}

// ✅ GET all registrations (for admin dashboard)
@GetMapping("/registrations")
public List<Registration> getAllRegistrations() {
    return repository.findAll();
}

// ✅ DELETE registration (for admin dashboard)
@DeleteMapping("/registrations/{id}")
public ResponseEntity<?> deleteRegistration(@PathVariable Long id) {

    if (!repository.existsById(id)) {
        return ResponseEntity.status(404).body("User not found ❌");
    }

    repository.deleteById(id);

    return ResponseEntity.ok("Deleted successfully ✅");
}


}

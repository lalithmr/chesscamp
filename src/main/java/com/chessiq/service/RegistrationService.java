package com.chessiq.service;

import com.chessiq.model.Registration;
import com.chessiq.repository.RegistrationRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public Registration save(Registration registration) {
        return registrationRepository.save(registration);
    }

    public List<Registration> getAll() {
        return registrationRepository.findAll();
    }

    public void delete(Long id) {
        registrationRepository.deleteById(id);
    }
}

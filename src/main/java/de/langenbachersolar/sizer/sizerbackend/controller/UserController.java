package de.langenbachersolar.sizer.sizerbackend.controller;

// RestController: Json --> Wir wollen die Daten zurück (nur die Daten).
// Normaler Controller: --> Gibt uns HTML zurück, in denen die Daten "drin stecken"

import de.langenbachersolar.sizer.sizerbackend.model.User;
import de.langenbachersolar.sizer.sizerbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("users")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    // Swagger noch einbinden !!!
    // https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api



}

package de.langenbachersolar.sizer.sizerbackend.bootstrap;

import de.langenbachersolar.sizer.sizerbackend.model.User;
import de.langenbachersolar.sizer.sizerbackend.repository.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitialDataBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final UserRepository userRepository;

    // Beste Möglichkeit: Constructor Based Dependency Injection
    // ... anstelle von @Autowire

    // Konstruktor
    public InitialDataBootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        this.userRepository.save(User.builder().email("markus@googlemail.com").build());
        this.userRepository.save(User.builder().email("martin@googlemail.com").build());
        this.userRepository.save(User.builder().email("andre@webmail.de").build());
    }

    // Spring --> needs @Component to be "seen" in SPRING !!!


}

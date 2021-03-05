package de.langenbachersolar.sizer.sizerbackend.repository;

import de.langenbachersolar.sizer.sizerbackend.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}



package de.langenbachersolar.sizer.sizerbackend.repository;

import de.langenbachersolar.sizer.sizerbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

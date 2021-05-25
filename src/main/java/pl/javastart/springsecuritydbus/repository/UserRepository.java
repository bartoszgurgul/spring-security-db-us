package pl.javastart.springsecuritydbus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.springsecuritydbus.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

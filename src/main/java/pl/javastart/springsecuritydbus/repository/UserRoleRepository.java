package pl.javastart.springsecuritydbus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.springsecuritydbus.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRole(String role);
}

package course.secao25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.secao25.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

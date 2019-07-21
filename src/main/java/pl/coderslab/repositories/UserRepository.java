package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    boolean existsUserByName(String name);

    void deleteUserByName(String name);
}

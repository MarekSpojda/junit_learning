package pl.coderslab.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Comparator;
import java.util.List;

@Repository
@Transactional
public class UserRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user) {
        entityManager.persist(user);
    }

    @SuppressWarnings({"JpaQlInspection", "unchecked"})
    public List<User> findAll() {
        return entityManager.createQuery("Select t from User t").getResultList();
    }

    public User findUserByName(String name) {
        return findAll().
                stream().
                filter(userFromList -> userFromList.getName().equals(name)).
                findFirst().
                get();
    }

    public User findUserById(Long id) {
        return findAll().
                stream().
                filter(userFromList -> userFromList.getId().
                        equals(id)).
                findFirst().
                get();
    }

    public void editUser(User user, String newName) {
        User userToEdit = findUserByName(user.getName());
        userToEdit.setName(newName);
        entityManager.merge(userToEdit);
    }

    public void deleteUserById(Long id) {
        User user = findUserById(id);
        entityManager.remove(user);
    }

    public Long findMaxId() {
        User maxUser = findAll().stream().max(Comparator.comparing(User::getId)).get();
        return maxUser.getId();
    }
}

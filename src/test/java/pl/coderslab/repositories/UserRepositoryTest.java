package pl.coderslab.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.coderslab.entities.User;
import pl.coderslab.settings.AppConfig;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class UserRepositoryTest {
    @Autowired
    private UserRepo userRepo;

    @Test
    public void shouldCreateUser() {
        //Given
        String userName = "January Kanarek";
        User user = new User();
        user.setName(userName);

        //When
        userRepo.save(user);

        //Then
        assertThat(userName, is(userRepo.findUserByName(userName).getName()));
    }

    @Test
    public void shouldEditUser() {
        //Given
        User user = userRepo.findUserById(1L);
        String newName = "Toszty Toszty Nonono";
        //When
        userRepo.editUser(user, newName);

        //Then
        assertThat(newName, is(userRepo.findUserById(1L).getName()));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldDdeleteUser() {
        //Given
        Long maxId = userRepo.findMaxId();
        System.out.println("Max id: " + maxId);

        //When
        userRepo.deleteUserById(maxId);
        User user = userRepo.findUserById(maxId);

        //Then
    }
}
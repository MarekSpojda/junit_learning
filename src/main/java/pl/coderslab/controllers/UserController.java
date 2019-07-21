package pl.coderslab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entities.User;
import pl.coderslab.repositories.UserRepo;
import pl.coderslab.repositories.UserRepository;

@Controller
@Transactional
public class UserController {
    private UserRepository userRepository;
    private UserRepo userRepo;

    @Autowired
    public UserController(UserRepository userRepository, UserRepo userRepo) {
        this.userRepository = userRepository;
        this.userRepo = userRepo;
    }

    @RequestMapping(path = "/", produces = "text/html; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String start() {
        User user = new User();
        user.setName("Jarek 2");
//        userRepository.save(user);
        userRepo.save(user);
        return "pages/login";
    }
}

package pl.dawidkaszuba.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dawidkaszuba.user.entity.User;
import pl.dawidkaszuba.user.repository.UserRepository;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        log.info("User has been saved.");
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        log.info("User has been load.");
        return userRepository.getUserByUserId(userId);
    }
}

package our_stories.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import our_stories.backend.entity.UserEntity;
import our_stories.backend.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

//    public UserEntity updateUser(UserEntity user) {}
}

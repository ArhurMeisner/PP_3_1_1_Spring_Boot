package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> index() {
        return userRepository.findAll();
    }


    @Override
    public User showUser(long id) {
        return userRepository.getReferenceById(id);
    }


    @Override
    public void saveUser(User user) {
        userRepository.save(user);

    }


    @Override
    public void updateUser(User user) {
        userRepository.save(user);

    }


    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);

    }
}

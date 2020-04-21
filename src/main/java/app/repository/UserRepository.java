package app.repository;

import app.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {

    private static UserRepository instance = new UserRepository();

    private ArrayList<User> userRepository;

    public static UserRepository getInstance() {
        return instance;
    }

    private UserRepository() {
        userRepository = new ArrayList<>();
    }

    public void add(User user) {
        userRepository.add(user);
    }

    public List<String> list() {
        return userRepository.stream().map(User::getName).collect(Collectors.toList());
    }
}

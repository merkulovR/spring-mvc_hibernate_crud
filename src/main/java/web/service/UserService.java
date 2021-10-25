package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(Long id);
    void addUser(User user);
    void update(User user);
    void delete(Long id);
}

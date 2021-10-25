package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUser(Long id);
    void addUser(User user);
    void update(User user);
    void delete(Long id);
}

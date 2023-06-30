package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public List<User> getUserById(int id);
    public void save(User user);
}

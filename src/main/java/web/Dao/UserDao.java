package web.Dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public List<User> getUserById(int id);
    public void save(User user);
}

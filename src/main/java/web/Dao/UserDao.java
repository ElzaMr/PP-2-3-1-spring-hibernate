package web.Dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void save(User user);
    public void update(User updatedUser/*,int id*/);
    public void delete(int id);
}

package web.Dao;
import org.springframework.stereotype.Repository;
import web.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User ").getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public User getUserById(int id) {

       return entityManager.find(User.class,id);
    }
    @Override
    public void save(User user) {
        entityManager.persist(user);

    }
    @Override
    public void update(User updatedUser){
        entityManager.merge(updatedUser);
        entityManager.flush();
    }
    public void delete(int id){
        entityManager.remove(getUserById(id));
    }
}

package web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
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
    public List<User> getUserById(int id) {////////////////////////////////////////////////////////
        return getAllUsers().stream().filter(user -> user.getId() == id).toList();

    }

    public void save(User user) {
        entityManager.persist(user);
    }

}

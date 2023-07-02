package web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
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
    public void update(User updatedUser,int id){
//        User oldUser = getUserById(id);//получили старого юзера по айди
//        updatedUser=entityManager.merge(oldUser);
//        oldUser.setName(updatedUser.getName());
//        oldUser.setSurname(updatedUser.getSurname());
//        oldUser.setAge(updatedUser.getAge());
        entityManager.merge(updatedUser);
        entityManager.flush();
    }
    public void delete(int id){
        entityManager.remove(getUserById(id));
    }
}

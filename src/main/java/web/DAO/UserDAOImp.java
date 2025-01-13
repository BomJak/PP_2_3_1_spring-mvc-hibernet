package web.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {
    @PersistenceContext
    public EntityManager entityManager;

    @Override
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        User user = findById(id);
        if(user != null) {
            entityManager.remove(user);
        }
    }

    @Override
    @Transactional
    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
}

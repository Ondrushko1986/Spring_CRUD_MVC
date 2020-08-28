package test.dao;


import test.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public void setUserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public void edit(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }


//
//    @Override
//    public List allUsers() {
//        return entityManager.createQuery("from User").getResultList();
//    }
//
//    @Override
//    public boolean add(User user) {
//        try {
//            entityManager.persist(user);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//    @Override
//    public void delete(User user) {
//        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
//    }
//
//    @Override
//    public void edit(User user) {
//        entityManager.merge(user);
//    }
//
//    @Override
//    public User getById(Long id) {
//        return entityManager.find(User.class, id);
//    }
//
//    @Override
//    public boolean isByEmail(String email) {
//        List results = entityManager.createNamedQuery("User.findByEmail", User.class)
//                .setParameter("email", email).getResultList();
//        if (results.isEmpty()) {
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public User getByName(String name) {
//        try {
//            Query query = entityManager.createNamedQuery("User.findByName", User.class);
//            query.setParameter("name", name);
//            User result2 = (User) query.getSingleResult();
//            return result2;
//        } catch (NoResultException nre) {
//            return null;
//        }
//    }
}

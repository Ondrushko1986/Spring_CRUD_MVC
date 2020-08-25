package test.dao;

import test.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = false)
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from users_crud_mvc").list();
    }

    @Override
    public void add(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void edit(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public User getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }


//    @PersistenceContext
//    public final EntityManager entityManager;
//
//    @Autowired
//    public UserDAOImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
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

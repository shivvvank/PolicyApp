package com.ProfileManagement.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import com.ProfileManagement.entity.Nominee;
import com.ProfileManagement.entity.NomineeRelation;
import com.ProfileManagement.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class UserDAOImp implements UserDAO {
    private final EntityManager entityManager;

    @Autowired
    public UserDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<NomineeRelation> GetNomineeRelations() {
        TypedQuery<NomineeRelation> t = entityManager.createQuery("FROM NomineeRelation", NomineeRelation.class);
        return t.getResultList();
    }
    @Override
    public NomineeRelation test(int id)
    {
        return entityManager.find(NomineeRelation.class,id);
    }
    @Override
    @Transactional
    public void AddProfile(User user) {
        if(!entityManager.contains(user))
        {
            entityManager.persist(user);
        }
        else
        {
            entityManager.merge(user);
        }
    }

    @Override
    @Transactional
    public void AddNominee(String username, Nominee nominee) {
        if (username.equals(nominee.getUsername())) {
            entityManager.persist(nominee);
        }
    }

    @Override
    public Nominee GetNominee(String username) {
        return entityManager.find(Nominee.class,username);
    }

    @Override
    @Transactional
    public void RemoveNominee(String username) {
        Nominee nominee = entityManager.find(Nominee.class,username);
        entityManager.remove(nominee);
    }
    @Override
    public User FindUser(String username)
    {
        User u = entityManager.find(User.class,username);
        return u;
    }
}
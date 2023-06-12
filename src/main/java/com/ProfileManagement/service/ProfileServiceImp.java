package com.ProfileManagement.service;

import com.ProfileManagement.dao.UserDAO;
import com.ProfileManagement.entity.Nominee;
import com.ProfileManagement.entity.NomineeRelation;
import com.ProfileManagement.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProfileServiceImp implements ProfileService{

    private UserDAO userDAO;

    @Autowired
    public ProfileServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<NomineeRelation> getNomineeRelations() {
        List<NomineeRelation> list = userDAO.GetNomineeRelations();
        return list;
    }

    @Override
    public void AddProfile(User user) {
        userDAO.AddProfile(user);
    }

    @Override
    public void AddNominee(User user, Nominee nominee) {
        userDAO.AddNominee(user,nominee);
    }

    @Override
    public Nominee GetNominee(String username) {
        return userDAO.GetNominee(username);
    }

    @Override
    public void RemoveNominee(String username) {
        userDAO.RemoveNominee(username);
    }
    @Override
    public Boolean FindUser(String username)
    {
        return userDAO.FindUser(username);
    }
}

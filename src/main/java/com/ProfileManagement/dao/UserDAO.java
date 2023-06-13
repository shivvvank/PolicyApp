package com.ProfileManagement.dao;

import com.ProfileManagement.entity.Nominee;
import com.ProfileManagement.entity.NomineeRelation;
import com.ProfileManagement.entity.User;

import java.util.List;
public interface UserDAO {
    List<NomineeRelation> GetNomineeRelations();
    void AddProfile(User user);
    void AddNominee(String username, Nominee nominee);
    Nominee GetNominee(String username);
    void RemoveNominee(String username);
    NomineeRelation test(int id);
    User FindUser(String username);
}
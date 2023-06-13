package com.ProfileManagement.service;

import com.ProfileManagement.entity.Nominee;
import com.ProfileManagement.entity.NomineeRelation;
import com.ProfileManagement.entity.User;

import java.util.List;

public interface ProfileService {
    List<NomineeRelation> getNomineeRelations();
    void AddProfile(User user);
    void AddNominee(String username, Nominee nominee);
    Nominee GetNominee(String username);
    void RemoveNominee(String username);
    User FindUser(String username);
}

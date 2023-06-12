package com.ProfileManagement.service;

import com.ProfileManagement.entity.Nominee;
import com.ProfileManagement.entity.NomineeRelation;
import com.ProfileManagement.entity.User;

import java.util.List;

public interface ProfileService {
    List<NomineeRelation> getNomineeRelations();
    void AddProfile(User user);
    void AddNominee(User user, Nominee nominee);
    Nominee GetNominee(String username);
    void RemoveNominee(String username);
    Boolean FindUser(String username);
}

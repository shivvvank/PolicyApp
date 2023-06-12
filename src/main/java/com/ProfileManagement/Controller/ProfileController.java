package com.ProfileManagement.Controller;

import com.ProfileManagement.entity.Nominee;
import com.ProfileManagement.entity.NomineeRelation;
import com.ProfileManagement.entity.User;
import com.ProfileManagement.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Annotation;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfileController{
    private ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }
    @GetMapping("/nomineetypes")
    public List<NomineeRelation> getNomineeRelations()
    {
        return profileService.getNomineeRelations();
    }
    @PostMapping("/profile")
    public String AddProfile(@RequestBody User user)
    {
        String result="";
        if(user==null)
        {
            return "IDK"+" "+user.getFirstname()+" "+user.getDateOfBirth();
        }
        profileService.AddProfile(user);
        if(user.getUsername()!=null && profileService.FindUser(user.getUsername()))
        {
            result = "Status:OK";
            result+=" Username:"+user.getUsername();
        }
        else
        {
            result = "Status 404: Failed to add profile";
        }
        return result;
    }
    @PostMapping("/profile/{Username}/Nominee")
    public String AddNominee(@PathVariable String Username,Nominee nominee)
    {
        return null;
    }
}

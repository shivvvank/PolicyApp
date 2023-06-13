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
        profileService.AddProfile(user);
        if(user.getUsername()!=null && profileService.FindUser(user.getUsername())!=null)
        {
            result+="Added Profile with username:"+user.getUsername();
        }
        return result;
    }
    @PostMapping("/profile/{username}/nominee")
    public String AddNominee(@PathVariable String username,@RequestBody Nominee nominee)
    {
        if(username == null || profileService.FindUser(username)==null)
        {
            return "Could Not Find the User with username : "+username+" !";
        }
        if(nominee.getUsername()==null) {
            nominee.setUsername(username);
        }
        profileService.AddNominee(username,nominee);
        Nominee n = profileService.GetNominee(username);
        if(n!=null) {
            return "Added nominee with ID "+n.getID()+" to user "+username+" !";
        }
        return "Sorry! Nominee Could not be added !";
    }
}

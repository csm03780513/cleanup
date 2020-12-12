package com.jayants.cleanapp.controllers;


import com.jayants.cleanapp.models.LoginData;
import com.jayants.cleanapp.models.UsersData;
import com.jayants.cleanapp.modules.AddUserModule;
import com.jayants.cleanapp.modules.LoginModule;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cleanapp",produces = "application/json")
public class Controllers {
    @Autowired
    LoginModule loginModule;
    @Autowired
    AddUserModule addUserModule;

//handles logging in
    @ApiOperation(value = "End point to login a user", response = UsersData.class)
    @PostMapping(value = "/validate")
    public LoginData login(@RequestBody UsersData users) {
        return loginModule.authenticateCredentials(users);
    }

    //handles addition of users
    @ApiOperation(value = "use this to add or sign up a new user into the system", response = UsersData.class)
    @PostMapping(value = "/adduser")
    public String addUser(@RequestBody UsersData users){
        return addUserModule.AddNewUser(users);
    }
}


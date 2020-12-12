package com.jayants.cleanapp.modules;


import com.jayants.cleanapp.GlobalData.GlobalVariables;
import com.jayants.cleanapp.models.LoginData;
import com.jayants.cleanapp.models.UsersData;
import com.jayants.cleanapp.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginModule {
    @Autowired
    UsersRepository usersRepository;

    LoginData loginData;



    public LoginModule(LoginData loginData) {
        this.loginData = loginData;
    }

    public LoginData authenticateCredentials(UsersData usersData) {
        String password = usersRepository.findByUsername(usersData.getUsername()).getPassword();

        if (usersData.getPassword().equals(password)) {
            loginData.setLoginMessage(GlobalVariables.SUCCESSFUL_MESSAGE);
            loginData.setResponseCode(200);
            loginData.setSuccessful(true);
        }

        return loginData;
    }
}

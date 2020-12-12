package com.jayants.cleanapp.modules;


import com.jayants.cleanapp.models.UsersData;
import com.jayants.cleanapp.repository.UsersRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddUserModule {
    @Autowired
    UsersRepository usersRepository;


    public String AddNewUser(UsersData users){
        JSONObject response=new JSONObject();
        try {
            response.put("username",users.getUsername());
        } catch (JSONException e) {
            e.printStackTrace();
        }

         usersRepository.save(users).toString();

        return response.toString();

    }

}

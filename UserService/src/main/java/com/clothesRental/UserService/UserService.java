package com.clothesRental.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.clothesRental.Common.models.User;
import com.clothesRental.Common.services.UserValidationService;

@Service
public class UserService {

    @Autowired
	UserValidationService userValidationService;

    void createUser(User user) throws Exception{
        try{
            userValidationService.createUser(user);
        } catch (Exception ex){
            throw new Exception(String.format("Error occurred while creating user: {}", ex.getMessage()));
        }
    }

}

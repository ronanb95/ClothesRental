package com.clothesRental.UserService.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.clothesRental.Common.services.UserValidationService;

@Configuration
public class UserServiceConfiguration {

    @Bean
    UserValidationService userValidationService(){
        return new UserValidationService();
    }
    

}

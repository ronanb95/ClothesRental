package com.clothesRental.Common.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.clothesRental.Common.models.User;
import com.clothesRental.Common.repository.UserRepository;


public class UserValidationService {
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public User createUser(User user){

        User userCreated = mongoTemplate.save(user);
        return userCreated;
    }

    public User getUserById(String userId){
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(userId));
        return mongoTemplate.findById(userId, User.class);
    }

}

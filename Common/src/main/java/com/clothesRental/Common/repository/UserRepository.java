package com.clothesRental.Common.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.clothesRental.Common.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    @Query("{username:'?0'}")
    User findUserByUsername(String username);

}

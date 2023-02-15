package com.clothesRental.Common.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("User")
public class User {
    
    @Id
    String id;  
    String firstName;
    String lastName;

}

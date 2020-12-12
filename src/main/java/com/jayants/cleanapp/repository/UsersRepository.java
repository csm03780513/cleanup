package com.jayants.cleanapp.repository;



import com.jayants.cleanapp.models.UsersData;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsersRepository extends MongoRepository<UsersData,String> {
    UsersData findByUsername(String username);

}

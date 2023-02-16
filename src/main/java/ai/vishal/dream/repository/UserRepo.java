package ai.vishal.dream.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ai.vishal.dream.model.mongo.User;

public interface UserRepo extends MongoRepository<User,String>{
    
}

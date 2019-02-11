package com.purpleslatelogdev.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.purpleslatelogdev.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

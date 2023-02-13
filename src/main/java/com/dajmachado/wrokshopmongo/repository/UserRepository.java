package com.dajmachado.wrokshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dajmachado.wrokshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}

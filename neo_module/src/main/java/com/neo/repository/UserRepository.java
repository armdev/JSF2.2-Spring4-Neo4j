package com.neo.repository;

import com.neo.domain.User;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.RelationshipOperationsRepository;

public interface UserRepository extends GraphRepository<User>, RelationshipOperationsRepository<User> {
    User findByEmail(String email);    

}

package com.dao;


import com.model.User;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends GraphRepository<User> {

}
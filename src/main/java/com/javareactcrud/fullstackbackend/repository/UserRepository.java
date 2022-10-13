package com.javareactcrud.fullstackbackend.repository;

import com.javareactcrud.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}




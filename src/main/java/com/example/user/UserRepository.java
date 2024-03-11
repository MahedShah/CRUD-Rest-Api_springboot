package com.example.user;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends jpaRepository<User, Long> {

}
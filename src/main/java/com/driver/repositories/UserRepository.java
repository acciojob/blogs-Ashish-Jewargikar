package com.driver.repositories;

import org.springframework.data.repository.CrudRepository;


import com.driver.models.User;


public interface UserRepository extends CrudRepository<User, Integer> {
}

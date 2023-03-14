package com.driver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.driver.models.Blog;


public interface BlogRepository extends JpaRepository<Blog, Integer> {

}

package com.driver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.driver.models.Image;


public interface ImageRepository extends JpaRepository<Image, Integer> {

}

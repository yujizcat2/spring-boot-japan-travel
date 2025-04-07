package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.JapanTravel;

/**
 * JapanTravel情報 Repository
 */
@Repository
public interface JapanTravelRepository extends JpaRepository<JapanTravel, Long> {
}

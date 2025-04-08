package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.JapanTravel;
import com.example.demo.repository.JapanTravelRepository;

@Service
public class JapanTravelService {

  @Autowired
  private JapanTravelRepository japanTravelRepository;

  public List<JapanTravel> searchAll() {
    return japanTravelRepository.findAll();
  }

  public JapanTravel searchById(Long id) {
    return japanTravelRepository.findById(id).orElse(null);
  }
  
  public JapanTravel findById(Long id) {
	return japanTravelRepository.findById(id).get();
   }
}

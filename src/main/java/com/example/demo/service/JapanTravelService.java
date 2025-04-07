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

  /**
   * すべての旅行地を取得
   * @return 旅行地のリスト
   */
  public List<JapanTravel> searchAll() {
    return japanTravelRepository.findAll();
  }

  /**
   * 旅行地IDで検索
   * @param id 旅行地ID
   * @return 旅行地情報
   */
  public JapanTravel searchById(Long id) {
    return japanTravelRepository.findById(id).orElse(null);
  }
}

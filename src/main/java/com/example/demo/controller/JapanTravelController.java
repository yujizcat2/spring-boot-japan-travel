package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.JapanTravel;
import com.example.demo.service.JapanTravelService;

/**
 * JapanTravel情報 Controller
 */
@Controller
public class JapanTravelController {

    /**
     * JapanTravel情報 Service
     */
    @Autowired
    JapanTravelService japanTravelService;

    /**
     * JapanTravel情報一覧画面を表示
     * @param model Model
     * @return JapanTravel情報一覧画面のHTML
     */
    @RequestMapping(value = "/japan-travel/list", method = RequestMethod.GET)
    public String displayList(Model model) {
        List<JapanTravel> japanTravelList = japanTravelService.searchAll();
        model.addAttribute("japanTravelList", japanTravelList);
        return "japan-travel/list";
    }

    /**
     * 特定の地名で旅行情報を検索
     * @param location 地名
     * @param model Model
     * @return 検索結果を表示するHTML
     */
    @RequestMapping(value = "/japan-travel/search", method = RequestMethod.GET)
    public String searchByLocation(String location, Model model) {
        List<JapanTravel> japanTravelList = japanTravelService.searchByLocation(location);
        model.addAttribute("japanTravelList", japanTravelList);
        return "japan-travel/search";
    }
    
    
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @RequestMapping(value = "japan-travel/add")
    public String displayAdd(Model model) {
      return "japan-travel/add";
    }
    
    @RequestMapping("/japan-travel/{id}")
    public String displayView(@PathVariable Long id, Model model) {
      JapanTravel jt = japanTravelService.findById(id);
      model.addAttribute("jtData", jt);
      return "japan-travel/view";
    }

    
    
}

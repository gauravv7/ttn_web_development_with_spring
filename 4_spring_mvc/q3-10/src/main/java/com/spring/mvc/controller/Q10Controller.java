package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/q10")
public class Q10Controller {

    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }

    @RequestMapping(value = "/index4", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index4");
        return modelAndView;
    }

    @RequestMapping(value = "/studentform.html", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView studentform(@ModelAttribute("studentCO") StudentCO studentCO) {
        ModelAndView modelAndView = new ModelAndView("submitdata");
        return modelAndView;
    }
}

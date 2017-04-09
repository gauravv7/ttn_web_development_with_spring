package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/q9")
public class Q9Controller {

    @RequestMapping(value = "/index3", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index3");
        return modelAndView;
    }

    @RequestMapping(value = "/studentform.html", method = RequestMethod.POST)
    @ResponseBody
    String studentform(StudentCO student) {
        return "Firstname " + student.getFirstname() + " Lastname " + student.getLastname();
    }
}

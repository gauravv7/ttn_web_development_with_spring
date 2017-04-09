package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/q8")
public class Q8Controller {


    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index1");
        return modelAndView;
    }

    @RequestMapping(value = "/studentform.html", method = RequestMethod.POST)
    @ResponseBody
    String studentform(@RequestParam("firstname") String firstname,
                      @RequestParam("lastname") String lastname) {
        return "Firstname " + firstname + " Lastname " + lastname;
    }
}

package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/q7")
public class Q7Controller {

    @RequestMapping("/firstnameAndLastname/{firstname}/{lastname}")
    @ResponseBody
    String returnFullName(@PathVariable Map<String,String> map) {

        return "firstName="+map.get("firstname") + ", lastName=" + map.get("lastname");
    }

}

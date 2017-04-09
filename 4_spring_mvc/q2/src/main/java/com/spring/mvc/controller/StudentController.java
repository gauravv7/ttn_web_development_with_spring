package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends MultiActionController {

    public ModelAndView index(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    public void index2(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws Exception {

        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("Hello from index2");
    }
}

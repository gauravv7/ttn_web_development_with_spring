package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

//Ques-5
public class NewLoggingAspect {

    @Before("within(com.spring.aop.PersonService.*)")
    public void logBeforeUsingWithin() {

        System.out.println("logging before within");
    }

    @Before("args(String)")
    public void logBeforeUsingArgs() {

        System.out.println("logging before args");
    }

    @Before("this(MethClassOne)")
    public void logBeforeUsingthis() {

        System.out.println("logging before this");
    }

}

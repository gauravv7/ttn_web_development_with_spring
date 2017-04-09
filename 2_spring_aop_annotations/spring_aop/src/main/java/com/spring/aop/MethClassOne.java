package com.spring.aop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MethClassOne {
    public void method2() {
        System.out.println("method1");
    }
}

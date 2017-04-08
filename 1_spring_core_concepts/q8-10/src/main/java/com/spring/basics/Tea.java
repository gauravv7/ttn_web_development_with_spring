package com.spring.basics;

import org.springframework.stereotype.Component;

/**
 * Created by gauravv7 on 9/4/17.
 */
@Component
public class Tea implements HotDrink {

    public void prepareHotdrink() {
        System.out.println("Preparing tea!!");
    }
}
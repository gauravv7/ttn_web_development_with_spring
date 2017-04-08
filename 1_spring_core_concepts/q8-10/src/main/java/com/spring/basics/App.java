package com.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gauravv7 on 9/4/17.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Restaurant restaurant = applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.printDrink();
    }
}

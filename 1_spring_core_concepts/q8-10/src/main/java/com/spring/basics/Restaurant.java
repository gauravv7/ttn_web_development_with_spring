package com.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by gauravv7 on 9/4/17.
 */
//@Component
public class Restaurant {

    //@Autowired
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }


    //  @Required //Ques8
    // @Autowired  //for setter method
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void printDrink() {

        this.hotDrink.prepareHotdrink();
    }

    @Autowired //for constructor
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}

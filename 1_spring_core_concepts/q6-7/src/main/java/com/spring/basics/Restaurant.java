package com.spring.basics;


/**
 * Created by gauravv7 on 9/4/17.
 */
public class Restaurant {

    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void printDrink() {

        this.hotDrink.prepareHotdrink();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}

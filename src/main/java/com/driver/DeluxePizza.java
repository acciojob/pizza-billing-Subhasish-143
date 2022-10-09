package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if (isVeg) {
            total += 150;
        }
        else {
            total += 200;
        }
        setBill("Base Price Of The Pizza: "+total+"\n");
    }
}

package com.driver;

public class Pizza {
    private boolean eCheese;
    private int cheesePrc;
    private boolean eTopping;
    private int toppPrc;
    private boolean bag;
    private int bagPrc;
    private boolean result;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.eCheese = false;
        this.eTopping = false;
        this.bag = false;
        this.result = false;
        this.cheesePrc = 80;
        this.bagPrc = 20;
        this.isVeg = isVeg;

        if (isVeg) {
            this.price = 300;
            this.toppPrc = 70;
        }
        else {
            this.price = 400;
            this.toppPrc = 120;
        }

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!eCheese) {
            this.price = this.price + this.cheesePrc;
            eCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!eTopping) {
            this.price = this.price + this.toppPrc;
            eTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!bag) {
            this.price = this.price + this.bagPrc;
            bag = true;
        }
    }

    public String getBill(){
        // your code goes here

        result = true;

        if (!result) {
            if (eCheese) {
                this.bill = this.bill + "Extra Cheese Added: 80"+"\n";
            }
            if (eTopping) {
                this.bill = this.bill + "Extra Toppings Added: "+toppPrc+"\n";
            }
            if (bag) {
                this.bill = this.bill + "Paperbag Added: 20"+"\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}

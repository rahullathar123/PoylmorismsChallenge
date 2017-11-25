package com.company;

public class BaseBurger {

    private String breadRollType;
    private String meatType;
    private int price;

    public int getPrice() {
        return BaseBurgerprice();
    }

    public BaseBurger(String breadRollType, String meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = 10;
    }

    public int BaseBurgerprice() {
        return price;
    }

    public boolean additionLettuce() {
        int lettucePrice = 2;
        System.out.println("The additional lettue cost is:$ " + lettucePrice);
        int afterLettuceCost = price + lettucePrice;
        price = afterLettuceCost;
        return true;
    }

    public boolean additionTomato() {
        int tomatoPrice = 1;
        System.out.println("The additional tomato cost  is:$ " + tomatoPrice);
        int afterTomatoCost = price + tomatoPrice;
        price = afterTomatoCost;
        return true;
    }

    public boolean additionCarrot() {
        int carrotprice = 1;
        System.out.println("The additional carrot cost is:$ " + carrotprice);
        int afterCarrotCost = price + carrotprice;
        price = afterCarrotCost;
        return true;
    }
}
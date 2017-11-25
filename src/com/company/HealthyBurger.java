package com.company;

public class HealthyBurger extends BaseBurger {
    BaseBurger baseBurger = new BaseBurger("french","frog");

    private int extraOnion;
    private int extraOlive;
    private int healthyBurgerExtra = baseBurger.BaseBurgerprice();


    public HealthyBurger(String breadRollType, String meatType) {
        super(breadRollType,meatType);
        this.extraOnion = 2;
        this.extraOlive = 1;
    }
    public boolean extraOnionPrice(){
        healthyBurgerExtra += extraOnion;
        System.out.println("The onion cost is: $"+extraOnion);
        return true;
    }
    public boolean extraOlivePrice(){
        healthyBurgerExtra+=extraOlive;
        System.out.println("The olive cost is: $"+extraOlive);
        return true;
    }
    public int getHealthyBurgerExtra() {
        return healthyBurgerExtra;
    }
}

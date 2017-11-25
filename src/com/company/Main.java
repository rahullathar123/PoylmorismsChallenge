package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseBurger baseBurger = new BaseBurger("italian","chicken");
        HealthyBurger healthyBurger = new HealthyBurger("Red Brown","Chicken");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("French","duck");


        baseBurger.additionCarrot();
        System.out.println("The base burger cost is: $"+baseBurger.getPrice());
        deluxeHamburger.extraFriesCost();
        System.out.println("The deluxe burger cost is: $"+deluxeHamburger.getDeluxeBurgerCost());
        healthyBurger.additionLettuce();
        healthyBurger.extraOnionPrice();
        System.out.println("Healthy burger cost is: $"+healthyBurger.getHealthyBurgerExtra());

    }
}

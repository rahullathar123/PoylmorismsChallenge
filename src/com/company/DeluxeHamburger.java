package com.company;

public class DeluxeHamburger extends BaseBurger{
    private int extraFries;
    private int extraChips;
    private int deluxeBurgerCost;

    public DeluxeHamburger(String breadRollType, String meatType) {
        super(breadRollType, meatType);
        this.extraFries = 3;
        this.extraChips = 4;
        this.deluxeBurgerCost =getPrice();
    }

    public boolean extraChipsCost(){
        extraChips = 2;
        System.out.println("The extraChipsCost is: $"+extraChips);
        deluxeBurgerCost+=extraChips;
        return true;
    }
    public boolean extraFriesCost(){
        extraFries = 3;
        System.out.println("The extraChipsCost is: $"+extraFries);
        deluxeBurgerCost+=extraFries;
        return true;
    }
    public int getDeluxeBurgerCost() {
        return deluxeBurgerCost;
    }
}

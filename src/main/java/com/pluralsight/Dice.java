package com.pluralsight;

public class Dice {

    int maxValue = 6;
    int minValue = 1;

    public int roll(){
        return (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
    }

}

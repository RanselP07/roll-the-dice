package com.pluralsight;

public class RollTheDice {

    static void main(String[] args) {

        Dice dice = new Dice();

        int roll1;
        int roll2;


        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++){

            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            if (i < 10) {
                System.out.println("Roll " + i + ":     " + roll1 + "   -   " + roll2 + "   Sum:    " + sum);
            }else if (i == 100){
                System.out.println("Roll " + i + ":   " + roll1 + "   -   " + roll2 + "   Sum:    " + sum);
            }else {
                System.out.println("Roll " + i + ":    " + roll1 + "   -   " + roll2 + "   Sum:    " + sum);
            }


            switch (sum){
                case 2:
                    twoCounter += 1;
                    break;
                case 4:
                    fourCounter += 1;
                    break;
                case 6:
                    sixCounter += 1;
                    break;
                case 7:
                    sevenCounter += 1;
                    break;
                default:
                    break;
            }

        }

        System.out.println("\nNumber 2 was rolled: " + twoCounter + " times");
        System.out.println("Number 4 was rolled: " + fourCounter + " times");
        System.out.println("Number 6 was rolled: " + sixCounter + " times");
        System.out.println("Lucky number 7 was rolled: " + sevenCounter + " times");

    }

}

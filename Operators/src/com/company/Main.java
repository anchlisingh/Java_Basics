package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar is true");
        }
        // Operator Challenge

        double variable1 = 20.00;
        double variable2 = 80.00;
        double variable3 = (variable1 + variable2) * 100;
        double variable4 = variable3 % 40.00;
        boolean variable5 = (variable4 == 0) ? true : false;
        System.out.println("The result = " + variable5);
        if(!variable5)
        {
            System.out.println("Got some remainder");
        }
    } }
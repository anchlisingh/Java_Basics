package com.company;
//Create a method called calcFeetAndInchesToCentimeters
//It needs to have two parameters
//feet is the first parameter, inches is the 2nd parameter

//You should validate that the first parameter feet is >=0
//You should validate that the 2nd parameter inches is >=0 and <=12
//return -1 from the method if either of the above is not true

//If the parameters are valid, then calculate how many centimeters
//comprise the feet and inches passed to this method and return that value

//Create a 2nd method of the same name but with only one parameter
//inches is the parameter
//validate that its >=0
//return -1 if is not true
//But if its valid, then calculate how many feet are in the inches
//and then here is the tricky part
//call the other overloaded method passing the correct feet and inches
//1 inch = 2.54cm and one foot = 12 inches 1ft = 30.48 cm

public class CalculateFeetAndInches {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double inCm = feet*30.48 + 2.54*inches;
         return inCm;
        }
        else {
            System.out.println("Invalid Output");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0 ) {
        double inFoot = (int) inches/12;
        double remainingInches= (int) inches%12;
            return calcFeetAndInchesToCentimeters(inFoot,remainingInches);
        }
        else
            return -1;
    }
}

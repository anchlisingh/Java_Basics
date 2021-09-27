package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue1 = (float)5.25;
        float myFloatValue2 = 5.25f;// instead of type casting can use "f"
        double myDoubleValue = 5.7668d;// mostly use double instead of float

        double pounds = 200d;
        double kg = pounds * 0.45359237d;
        System.out.println("Final pound to kg = " + kg);

    }
}

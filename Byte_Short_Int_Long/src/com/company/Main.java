package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        int myNumber = 1_234_56;
        System.out.println(myNumber);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value =" + myMinLongValue);
        System.out.println("long Maximum Value =" + myMaxLongValue);

        int myNewByteValue =  (byte) (myMinByteValue/2); //Type Casting

        byte myByteVariable = 123;
        short myShortVariable = 1138;
        int myIntVariable = 445698;
        long myLongVariable = 50000 + 10 * (myByteVariable+myShortVariable+myIntVariable);
        System.out.println("my long variable = " + myLongVariable);
    }//4519590
}

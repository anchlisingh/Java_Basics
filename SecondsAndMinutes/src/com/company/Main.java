package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int seconds = 3945;
       String calData =  SecondsAndMinutes.getDurationString(seconds);
       System.out.println("Calculated Data " + calData);
    }

}

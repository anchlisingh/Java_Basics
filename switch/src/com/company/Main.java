package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char switchValue = 'D';
        switch(switchValue){
            case 'A':
                System.out.println("This is switch case A");
                break;
            case 'B':
                System.out.println("This is switch case B");
                break;
            case 'C':
                System.out.println("This is switch case C");
                break;
            case 'D': case 'E': case 'F':
                System.out.println("This is switch case D , E and F");
                break;
            default:
                System.out.println("This is default case ");
            break;


        }

    }

}

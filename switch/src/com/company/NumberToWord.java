package com.company;
public class NumberToWord {
    // write your code here

    public static void main(String[] args) {
        numberToWords(1234);
    }
    public static void numberToWords(int number)//1234
    {
        int reverseNum = 0,cpyNum = number,value = 0, finalCount = 0,count = 0;
        if(number >= 0) // 1234
        {
            reverseNum = reverse(number);
            while(reverseNum != 0)
            {
                value = reverseNum%10;
                switch(value)
                {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                count++;
                reverseNum = reverseNum/10;
            }
            if(count != getDigitCount(number))
            {
                finalCount = getDigitCount(number) - count;
                while(finalCount != 0)
                {
                    System.out.println("Zero");
                    finalCount--;
                }
            }


        }
        else
            System.out.println("Invalid Value");
    }

    public static int getDigitCount(int number)
    {
        int count = 0;
        if(number >= 0)
        {
            while(number >= 0)
            {
                count++;
                number /=10;

            }
            return count;
        }
        else
            return -1;
    }

    public static int reverse(int number)//101
    {
        int cpyNum = number,reverse = 0, remainder;
        while(cpyNum != 0)
        {
            remainder = cpyNum%10;
            reverse = 10 * reverse + remainder;
            cpyNum /=10;

        }
        return reverse;
    }

}
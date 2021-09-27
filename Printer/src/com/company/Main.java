package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(100);
        printer.setTypeOfPrinter("duplex");
        printer.setNoOfPagesToBePrinted(10);
        System.out.println("Toner level left " + printer.getTonerLevel());
        System.out.println("Pages printed till now " + printer.getNoOfPagesToBePrinted());
        printer.setTypeOfPrinter("simple");
        printer.setNoOfPagesToBePrinted(10);
        System.out.println("Toner level left " + printer.getTonerLevel());
        System.out.println("Pages printed till now " + printer.getNoOfPagesToBePrinted());
        printer.setTypeOfPrinter("duplex");
        printer.setNoOfPagesToBePrinted(50);
        System.out.println("Toner level left " + printer.getTonerLevel());
        System.out.println("Pages printed till now " + printer.getNoOfPagesToBePrinted());
        printer.setTypeOfPrinter("simple");
        printer.setNoOfPagesToBePrinted(70);
        System.out.println("Toner level left " + printer.getTonerLevel());
        System.out.println("Pages printed till now " + printer.getNoOfPagesToBePrinted());
    }
}

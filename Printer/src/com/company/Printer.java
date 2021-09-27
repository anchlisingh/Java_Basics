package com.company;

public class Printer {
    private int tonerLevel = 0;
    private int noOfPagesToBePrinted = 0;
    private static int previousPagePrinted = 0;
    private String typeOfPrinter = null;

    public Printer(int tonerLevel) {
        if(tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
    }

    public int getTonerLevel() {
        if(typeOfPrinter == "duplex" && tonerLevel >= 0 && tonerLevel >= ((noOfPagesToBePrinted / 2) + (noOfPagesToBePrinted % 2))) {
            tonerUsed();
            return tonerLevel;
        }
        else if(typeOfPrinter != null && tonerLevel > 0 && tonerLevel >= noOfPagesToBePrinted && typeOfPrinter != "duplex") {
            tonerUsed();
            return tonerLevel;
        }
        else {
            System.out.println("Refill the toner Level before using ");
            return -1;
        }
    }

    public int getNoOfPagesToBePrinted() {
        return previousPagePrinted;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setNoOfPagesToBePrinted(int noOfPagesToBePrinted) {
        this.noOfPagesToBePrinted = noOfPagesToBePrinted;
    }

    public void setTypeOfPrinter(String typeOfPrinter) {
        this.typeOfPrinter = typeOfPrinter;
    }

    public void tonerUsed() {
            System.out.println("The toner level is appropriate. Please wait till we print your pages");
            if (typeOfPrinter == "duplex") {
                tonerLevel = tonerLevel - (noOfPagesToBePrinted / 2) + (noOfPagesToBePrinted % 2);
                previousPagePrinted = previousPagePrinted + (noOfPagesToBePrinted / 2) + (noOfPagesToBePrinted % 2);
            } else if (typeOfPrinter != null) {
                previousPagePrinted = previousPagePrinted + noOfPagesToBePrinted;
                tonerLevel = tonerLevel - noOfPagesToBePrinted;
            }
            else
                System.out.println("Not enough toner to print the pages");
        }

    }

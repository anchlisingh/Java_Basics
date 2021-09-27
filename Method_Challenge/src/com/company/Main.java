package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int result = calculateHighScorePosition(1500);
        displayHighScorePosition("moxxie", result);
        result = calculateHighScorePosition(900);
        displayHighScorePosition("loona", result);
        result = calculateHighScorePosition(400);
        displayHighScorePosition("blitzo", result);
        result = calculateHighScorePosition(50);
        displayHighScorePosition("stolas", result);
        result = calculateHighScorePosition(100);
        displayHighScorePosition("millie", result);
    }

    public static int displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table\n");
        return 0;
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 ) {
            return 2;
        } else if (score >= 100 ) {
            return 3;
        } else {
            return 4;
        }
    }
}

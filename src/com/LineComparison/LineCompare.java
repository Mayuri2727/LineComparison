package com.LineComparison;

public class LineCompare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        int x1 = 3;
        int x2 = 2;
        int y1 = 4;
        int y2 = 5;
        int x12 = 1;
        int y12 = 7;
        int x22 = 2;
        int y22 = 7;
        float line1 = (float) Math.sqrt((x1 - x2) ^2 + (y2 - y1) ^2);
        float line2 = (float) Math.sqrt((x12 - x22) ^2 + (y22 - y12) ^2);
    }
}

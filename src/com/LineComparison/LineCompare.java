package com.LineComparison;

public class LineCompare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        int x1 = 7;
        int x2 = 2;
        int y1 = 4;
        int y2 = 5;
        int x12 = 5;
        int y12 = 7;
        int x22 = 2;
        int y22 = 7;
        Double line1 = (Double) Math.sqrt((x1 - x2) ^2 + (y2 - y1)^2);  //written formula for calculating line length
        Double line2 = (Double) Math.sqrt((x12 - x22) ^2 + (y22 - y12) ^2);
        System.out.println("Length of the line1: "+line1);
        System.out.println("Length of the line2: "+line2);

        boolean length = (line1.equals(line2));
        if (length==true) {                                      // Using Equals method to check both lines are equal
            System.out.println("Both lines are Equal");
             }else{
            System.out.println("Both lines are not Equal");
        }
            int length1 = (line1.compareTo(line2));           // Using CompareToMethod to check that one line is greater or less than the other line
            if (length1>0) {
            System.out.println("Line 1 is Greater than Line 2 : " + line1);
            } else if(length1==0) {
                System.out.println("Line 1 is equals to Line 2 :" + line2);
            } else {
                System.out.println("Line 1 is Greater than Line 2 ");
            }
    }
}






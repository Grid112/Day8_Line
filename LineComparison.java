package com.BridgeLabz;

import java.util.Scanner;

public class LineComparison {
    int x1, x2, x3, x4, y1, y2, y3, y4;
    double line1, line2;
    Scanner scanner = new Scanner(System.in);

    //To Get Co-Ordinates oF Line1
    public double lengthOfLine1() {
        System.out.println("Enter Cartesian Co-ordinates for first line");
        System.out.print("Enter the value of x1 : ");
        x1 = scanner.nextInt();
        System.out.print("Enter the value of x2 : ");
        x2 = scanner.nextInt();
        System.out.print("Enter the value of y1 : ");
        y1 = scanner.nextInt();
        System.out.print("Enter the value of y2 : ");
        y2 = scanner.nextInt();
        line1 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2);
        System.out.println("Length of the line1 is : " + line1);
        return line1;
    }
    //To Get Co-Ordinates oF Line2
    public double lengthOfLine2() {
        System.out.println();
        System.out.println("Enter Cartesian Co-ordinates for Second line");
        System.out.print("Enter the value of x3 : ");
        x1 = scanner.nextInt();
        System.out.print("Enter the value of x4 : ");
        x2 = scanner.nextInt();
        System.out.print("Enter the value of y3 : ");
        y1 = scanner.nextInt();
        System.out.print("Enter the value of y4 : ");
        y2 = scanner.nextInt();
        line2 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2);
        System.out.println("Length of the line1 is : " + line2);
        return line2;
    }
    //TO Check If two Lines Are Equal Or Not
    double line1Length = lengthOfLine1();
    double line2Length = lengthOfLine2();
    public void EqualTo() {
        System.out.println();
        if (line1 == line2) {
            System.out.println("The length of both the Lines are Equal");
        }
        else {
            System.out.println("The length of both the Lines are Not Equal");
        }
    }

    public static void main(String[] args) {
        LineComparison Line = new LineComparison();
        Line.EqualTo();
    }
}

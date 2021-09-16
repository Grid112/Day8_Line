package com.BridgeLabz;

import java.util.Scanner;

public class LineComparison {
    int x1, y1, x2, y2;
    double line1;
    Scanner scanner = new Scanner(System.in);
    public double lengthOfLine() {System.out.println("Enter Cartesian Co-ordinatesvfor first line");
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

    public static void main(String[] args) {
        LineComparison Line = new LineComparison ();
        Line.lengthOfLine();
    }
}

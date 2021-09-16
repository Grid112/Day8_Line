package com.BridgeLabz;

import java.util.Scanner;

public class LineComparison {
    int x1, y1, x2, y2, x3, y3, x4, y4;
    double line1, line2;
    Scanner scanner = new Scanner(System.in);

    //To Get Co-Ordinates oF Line1
    public double lengthOfLine1() {
        System.out.println("Enter Cartesian Co-ordinatesvfor first line");
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
        System.out.println("Enter Cartesian Co-ordinatesvfor first line");
        System.out.print("Enter the value of x1 : ");
        x1 = scanner.nextInt();
        System.out.print("Enter the value of x2 : ");
        x2 = scanner.nextInt();
        System.out.print("Enter the value of y1 : ");
        y1 = scanner.nextInt();
        System.out.print("Enter the value of y2 : ");
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
            System.out.println("Calling CompareTo Method");
        }
    }
    //Comparing Two Lines to Check Which Line is Greater
    public void CompareTo() {
        System.out.println();
        if (line1Length > line2Length) {
            System.out.println("The length of Line1 is greater than Line2 ");
        } else if (line2Length > line1Length){
            System.out.println("The length of Lines2 is greater than Line1");
        }else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LineComparison Line = new LineComparison();
        Line.EqualTo();
        Line.CompareTo();
    }
}

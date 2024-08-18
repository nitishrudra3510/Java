//Write a Java program with a class name OverloadArea with overload methods area(float) and area(float, float) to find area of square and rectangle.

// Write the main method within the class and assume that it will receive a total of 2 command line arguments of type float.

// If the main() is provided with arguments : 1.34, 1.98 then the program should print the output as:
// Area of square for side in meters 1.34 : 1.7956
// Area of rectangle for length and breadth in meters 1.34, 1.98 : 2.6532001



package Oops;

import java.util.Scanner;

public class question_Pract {
    public float area(float a){
        return a*a;
    }
    public float area(float a, float b){
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        // float a = Float.parseFloat(args[0]);
        // float b = Float.parseFloat(args[1]);
        question_Pract obj = new question_Pract();
        System.out.println("area of sqaure : "+ obj.area(a));
        System.out.println("area of rectangle : "+ obj.area(a,b));

        Scanner.clas
    }
}

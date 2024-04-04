// write a program to calculate area of circle using user defined methods.

import java.util.Scanner;

public class Circle {

    static void area(float r){
        System.out.println("Area of circle: " + (3.14*r*r));
    }

    public static void main(String s[]){
        float r;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");

        r = sc.nextFloat();
        area(r);

    }
    
    
}
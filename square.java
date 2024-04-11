 // 5. area of square 
// class square and class new two methods area and display.

import java.util.Scanner;

public class square {
    public static void main(String s[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int a = sc.nextInt();
        int res =new1.area(a);
        System.out.println("Area of square : "+ res);
    }
}
class new1{
    static int area(int a){
        return a*a;
    }
}

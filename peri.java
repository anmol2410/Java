// 4.write a program to calucltate perimeter of rectangle
// peri (main )and rec 2 objects. 
import java.util.Scanner;

public class peri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        rec rec1 = new rec();
        rec1.perimeter(l, b);

        rec rec2 = new rec();
        rec2.perimeter(5,6);
        

    }
    
}
class rec{
    static void perimeter(int l, int b){
        System.out.println("Perimeter of rectangle: "+ l*b);
    }
}
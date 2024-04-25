import java.util.Scanner;

class first{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ") ;
        int n = sc.nextInt();
        int ans = evenOdd.checker(n);
        if(ans==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }

        

    }
}
class evenOdd{
    static int checker(int n){
        if (n%2==0){
            return 0;
        }
        else return 1;
    }
}

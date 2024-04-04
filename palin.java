// write a program for checking palindrom

import java.util.Scanner;
class palin{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = s1.nextLine();
        int len = s.length();
        // System.out.println("length: "+ len);
        String res = checker(s,len);
        System.out.println(res);
        
        


    }

    static String checker(String s,int len){
        String m = "";

        for (int i = len-1; i>=0; i--){
            m = m + s.charAt(i);
             
        }
        if(s.equals(m)){
            return "Palindrom";
        }
        else{
            return "Not Palindrom";
        }
        

    }
}
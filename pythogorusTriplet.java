package javaPrograms;
import java.util.Scanner;

public class pythogorusTriplet {
    public static void main(String[]main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        int max = a ;
        if(b>=max){
            max = b ;
        }if(c>=max){
            max = c ;
        }if(max == a){
            boolean flag = ( b*b + c*c) == (a*a);
            System.out.println(flag);
        }else if (max == b){
            boolean flag = (a*a+c*c) == (b*b);
            System.out.println(flag);
        }else {
            boolean flag = (b*b + a*a) == (c*c);
            System.out.println(flag);
        }

    }
    
}

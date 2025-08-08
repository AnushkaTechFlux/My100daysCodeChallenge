package javaPrograms;
import java.util.Scanner;
public class inverseOfAnumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number : ");
        int n = sc.nextInt();
        int inv = 0 ;
        int originalPos = 1 ; 
        while(n!=0){
            int originalDig = n%10;
            int invPos = originalDig;
            int invDig = originalPos;
            inv = inv + invDig * (int)Math.pow(10 , invPos-1);
            n = n/10;
            originalPos++;
        }
        System.out.println(inv);
    }
}
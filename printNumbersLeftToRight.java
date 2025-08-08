 package javaPrograms;
 import java.util.*;

public class printNumbersLeftToRight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  
        int digits = 0;
        int original = n;  

        while (n != 0) {
            n = n/10;   
            digits++;     
        }
        
        int div = (int) Math.pow(10, digits - 1);

        
        n = original;

        while (div != 0) {
            int digit = n / div;     
            System.out.println(digit);  

            n = n % div;    
            div = div / 10; 
        }

        sc.close();  
    }
}
    

        

package javaPrograms;
import java.util.*;
public class rotatedNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the no u wish to rotated : ");
        int n = sc.nextInt();
        System.out.println("How many times u wish to rotate the no : ");
        int k = sc.nextInt();
        int count = 0;
        int copy = n;
        while(copy!=0){
            copy = copy/10;
            count++;
        }
        k = k%count;
        if(k<0){
            k = k+count;
        }
        int div = 1 ;
        int multip = 1;
        for (int i = 1 ; i<=k ; i++){
            div = div*10;
        }
        for(int i = 1 ; i<=(count-k) ; i++){
            multip = multip*10;

        }
        int lastPart = n% div;
        int firstPart = n/div;
        int rotated = lastPart * multip +firstPart;
        System.out.println(rotated);
    }
}
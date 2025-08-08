package javaPrograms;

public class equalsOrNot {
    public static void main(String[]args){
        int n1 = 10;
        int n2 = 20;
        if (n1==n2){
            System.out.println( n1  + " is equal to " + n2);
        }else{
                if(n1>n2){
                    System.out.println( n1 + " is bigger than " + n2);
            } else{
                System.out.println( n1 + " is smaller than "+ n2);
            }
        }
    }
}

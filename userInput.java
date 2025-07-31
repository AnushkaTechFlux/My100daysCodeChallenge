
import java.util.*;
public class userInput{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       String name  = sc.nextLine();
       System.out.println(" Hello " +  name );

       int age = sc.nextInt();
       System.out.println("AGe " + age);

        int n = sc.nextInt();
       for(int i = 0 ; i<=n;i++){
        System.out.println(" Hello "+ name  + " the counting is : "+ i);
       }
    }
}


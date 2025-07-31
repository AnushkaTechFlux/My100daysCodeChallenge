

public class variableMaking {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of " + x + " and " + y + " is :" + sum);


        int product = x*y;
        System.out.println("Proudct of " + x + " and " + y + " is : " + product);

        //x/y , y/x , x%y

        int variable1 = x/y;
        int variable2 = y/x;
        int variable3 = x%y;
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        
        //xy/x+y = 15.10/15+10 = 150/25 = 6

        int expression = (x*y)/(x+y);
        System.out.println(expression);

    }
}

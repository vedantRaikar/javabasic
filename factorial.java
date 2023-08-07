import java.util.Scanner;

public class factorial {

    static int fact(int num) {
         int fact = 1 ;


        for(int i = 1 ; i <= num ; i++){
             fact = fact * i ; 

        }
       return fact ;
    }
    public static void main(String []arg){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int num = read.nextInt();
        int result = fact(num);

        System.out.print(" The factorial of the number is " + result);
    }
}

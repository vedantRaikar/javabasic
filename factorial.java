import java.util.Scanner;

public class factorial {

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int fact(int num) {
         int fact = 1 ;
         for(int i = 1 ; i <= num ; i++){
             fact = fact * i ; 
            }
       return fact ;
    }
    public static void main(String []arg){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n = read.nextInt();
        System.out.println("Enter the Value of r: ");
        int r = read.nextInt();

        int result = nCr( n , r);

        System.out.print("The nCr value is " + result);
    }
}

import java.util.Scanner;

public class recusionfactorial {

    public static void main( String [] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println( fact);
    }

    public static int factorial(int num){
        if(num >= 1){
            return num * factorial(num - 1);
        }
        else {
            return 1;
        }
    }
    
}

import java.util.Scanner;

public class factorial {
    public static void main(String []arg){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int num = read.nextInt();
        int fact = 1 ;


        for(int i = 1 ; i <= num ; i++){
             fact = fact * i ; 

        }
        System.out.println(fact);
    }
}

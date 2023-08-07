import java.util.Scanner;

public class checkpalindrome {

    static int check(int num){
        int rev = 0;

        while( num != 0 ){
            int remain = num % 10 ;
            rev = rev * 10 + remain;
            num = num/10;
        }

        return rev ;

    }

    public static void main(String[]arg){
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int temp = num ;
        int reverse = check(num); 

        System.out.print(" The reversed number is: " + reverse);

        if(reverse == temp ){
            System.out.print(" The number you entered is a palindrome ");
        }
        else{
            System.out.print(" The number you entered is not a palindrome ");
        }

    }
    
}

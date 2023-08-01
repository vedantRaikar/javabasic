import java.util.Scanner;

public class oddeven {

    public static void main(String []arg){
        Scanner reader = new Scanner (System.in);
        System.out.println("enter the number : ");
        int num = reader.nextInt();

        if (num % 2 == 0){
            System.out.println(" The number " + num + " is even" );
        }
        else{
            System.out.println(" The number " + num + " is odd" );
        }
    }

    
}

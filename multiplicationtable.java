import java.util.Scanner;

public class multiplicationtable {
    public static void main (String [] arg){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = read.nextInt();
        
        for(int i = 1 ; i <= 10 ; ++i){
            System.out.printf(" %d * %d = %d \n" , num , i , num*i);

        }

    }
    
}

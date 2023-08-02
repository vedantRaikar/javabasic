import java.util.Scanner;

public class sumofnaturalnumber{
    public static void main(String [] arg){
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int sum = 0 ; 

        for(int i = 1 ; i <= num ; ++i){
            sum += i ;

        }

        System.out.println(sum);
    }
}
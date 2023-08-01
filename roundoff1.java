import java.util.Scanner;

public class roundoff1 {
    public static void main(String [] arg){
        Scanner reader = new Scanner(System.in);
        System.out.println("the the decimal number: ");
        double num = reader.nextFloat();

        System.out.format(" %.2f " , num);

    


    }

    
}

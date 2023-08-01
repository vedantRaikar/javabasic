import java.util.Scanner;



public class largestnum {
    public static void main(String [] arg){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        if(a >= b && a >= c){
            System.out.println(a + " is the greatest ");
        }
        else if(b >= a && b >= c){
            System.out.println(b + " is the greatest ");
        }
        else {
            System.out.println(c + " is the greatest ");
        }
        
    }
}



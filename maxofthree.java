import java.util.Scanner;

public class maxofthree {

    static void max(int a , int b , int c){
        if (a>b && a>c){
            System.out.print("the greatest number is " + a);
        }
        else if(b>a && b>c){
            System.out.print("the greatest number is " + b);
        }
        else {
            System.out.print("the greatest number is " + c);
        }
    }
    public static void main(String[]arg){
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        max(a , b , c);



    }
    
}

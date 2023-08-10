import java.util.Scanner;



public class maxofthreenested {

    static void max(int a , int b , int c ){
        if(a>b){
            if(a>c){
                System.out.print("The greatest numbers is : " + a);
            }
            else{
                  System.out.print("The greatest numbers is : " + c);
            }
        }
        else{
            if(b>c){
                System.out.print("The greatest numbers is : " + b);
            }
            else{
                System.out.print("The greatest numbers is : " + c);
            }
        }

    }

    public static void main(String[]arg){
         Scanner read = new Scanner(System.in);
         int a = read.nextInt();
         int b = read.nextInt();
         int c = read.nextInt();

         max(a,b,c);


    }
    
}

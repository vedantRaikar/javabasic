import java.util.Scanner;

public class largestnumfuction {

public static int largest(int a , int b , int c){
    
    if(a > b && a > c){
        return a ;
    }
    else if( b > c && b > a){
        return b ; 
    }
    else{
        return c;
    }
}

public static void main( String [] arg){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the three numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    int result = largest(a , b , c);

    System.out.print(result);
    
}
    
}

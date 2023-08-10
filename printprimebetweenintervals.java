import java.util.Scanner;

public class printprimebetweenintervals {
    
    public static boolean checkprime(int num){
        boolean flag = true;

        for(int i = 2 ; i <= num/2 ; i++){
             if (num % i == 0){
                flag = false ;
                break;
             }
        }
        return flag; 
    }

    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the higher and the lower limit: ");

        int low  = sc.nextInt();
        int high = sc.nextInt();
    
        while ( low < high){
            if(checkprime(low) == true){
                System.out.println(low);
            }
            low++;
        }
        
    }
}

import java.util.Scanner;

public class checkvowel {
    public static void main (String []arg){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the character to be checked: ");
        char c = reader.next().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println( c + " is a vowel ");
        }
        else{
            System.out.println( c + " is not a vowel ");
        }
    }
    
}

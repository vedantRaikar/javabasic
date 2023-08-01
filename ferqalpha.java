import java.util.Scanner;

public class ferqalpha {
    public static void main(String [] arg){
        int frequency = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = reader.nextLine();
        System.out.println("enter the character to find the frequency: ");
        char c = reader.next().charAt(0);
    

        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("the frequency is: " + frequency);
    }
    
}

import java.util.Scanner;

public class removespace {
    public static void main(String [] arg){
        Scanner reader = new Scanner(System.in);
        String sentence = reader.nextLine();

        sentence = sentence.replaceAll(" " , "");
        System.out.println(sentence);


    }
}

public class countdigits {
    public static void main(String [] arg){
        int num = 1232323;
        int count = 0 ;

        while (num != 0){
            num /= 10 ; 
            ++count;
        }
      System.out.println("Number of digits: "  + count);  
    }
}

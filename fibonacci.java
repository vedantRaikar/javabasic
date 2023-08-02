public class fibonacci {
    public static void main(String []arg){
        int n = 10 , first = 0 , second = 1 ;

        System.out.println("the fibonacci series of " + n + " terms is :");

        for(int i = 1 ; i <= n ; i++){
            System.out.println( first + ",");
            int next = first + second ;
            first = second ;
            second = next ;
        }
    }
}

public class swap {
    public static void main(String [] arg){
        float first = 1.2f , second = 1.3f; 

        System.out.println("--before swap--");
        System.out.println("first number = " + first); 
        System.out.println("second number = " + second);

        float temp = first; 
        first = second ;
        second = temp; 

        System.out.println("--After swapping--");
        System.out.println("first number = " + first);
        System.out.println("second number = " + second);
        

    }
    
}

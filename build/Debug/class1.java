package build.Debug;

public class class1 {
    public static void main(String [] args){
        try{
        int d = 0 ;
        int c = 42 / d;
        System.out.println("this will not be printed");
        }
      
     
       
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the index is out of bound");
        }
        catch(ArithmeticException e){
            System.out.println("you cant divide by 0");

        }
    }
}

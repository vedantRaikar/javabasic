import java.util.Scanner;

class overflowError extends Exception{
 overflowError(String s){
        super(s);
    }
}

class underflowError extends Exception{
  underflowError(String s){
        super(s);
    }
}


public class stackexception {
    final static int max = 3 ;
    public static int stack[] = new int[max];
    public static int top = -1;

    
    

    public static void push(){
        Scanner sc = new Scanner(System.in);
        try{
        if(top == max - 1){
            throw new overflowError("overflow");
        }
        else{
            System.out.println("Enter the element: ");
            int val = sc.nextInt();
            top++ ;
            stack[top] = val ;
            
        }
    }
        catch(overflowError e ){
            System.out.println("Stack overflow");
        }
    }

    public static void pop(){
       try{
        if(top == -1){
            throw new underflowError("underflowexception");
        }
        else{
            int val = stack[top];
            top--;
            System.out.println("The element deleted :" + val);

        }
    }

        catch(underflowError e){
            System.out.println("Stack underflow.");
        }
        
    }


    public static void display(){
         for(int i = top -1  ; i >= 0  ; i--){
            System.out.println("data->"+ stack[i]);
         }
    }


    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int ch ;
      do{
        System.out.println("..........Menu..........");
        System.out.println("\n1.push\n2.pop\n3.display\n4.exit");
        System.out.println("enter the choice: ");
        ch = sc.nextInt();

        switch(ch){
            case 1: 
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
          }

      }while(ch != 4 );




    }
}

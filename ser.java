import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface series{
    public void get_next();
    public void reset_series();
    public void start_set();
    public void display();
}

class seriesmethods implements series {
    int diff , start , curr; 
    List<Integer> arr = new ArrayList<Integer>();
    
    public void start_set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting element: ");
        start = sc.nextInt();
        curr = start ;
        arr.add(start);
        System.out.println("Enter the difference between element: ");
        diff = sc.nextInt();
    }

    public void get_next() {
        curr = curr + diff ;
        arr.add(curr);
        System.out.println("th next element: " + curr);
    }

    public void reset_series(){
        System.out.println("...resenting the series....");
        arr.clear();
        start_set();
    }

    public void display(){
        System.out.println("the elements in series are: " + arr);
    }

}

public class ser {
    public static void main(String []args){
       seriesmethods s = new seriesmethods();
       s.start_set();
       s.get_next();
       s.get_next();
       s.get_next();
       s.display();
       s.reset_series();

    }
}

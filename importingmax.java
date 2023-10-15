import p1.max;

public class importingmax {
 public static void main(String [] args){
   max a = new max();
   System.out.println("for integers:" + a.maxthree(1,2,3));
   System.out.println("for float:" + a.maxthree(1.2 , 1.1 , 1.3));
   int [] arr = {1,2,3,4,5};
   System.out.println("for array:" +a.maxthree(arr));
   int[][] mat = {{1,2,3},{5,6,7},{8,9,10}};
   System.out.println("for 2d array:" + a.maxthree(mat));


 }


    
}

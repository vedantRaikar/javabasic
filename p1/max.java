 package p1;

public class max{

    public int maxthree(int a , int b , int c ){
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else{
            return c;
        }

    }
    public double maxthree(double a , double b , double c ){
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else{
            return c;
        } 
    }
    public int maxthree(int arr[]){
        int n = arr.length ;
        int m = arr[0];
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > m){
                m = arr[i];
            }
        }
     return m ; 
    }
    
    public int maxthree( int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int m = arr[0][0]; 

        for(int i = 0 ; i < r ; i++){
           for(int j = 0 ; j < c ; j++){
               if(arr[i][j] > m){
                  m= arr[i][j];
               }
           }
        }
      return m ;
    }

}
public class gcd {
    public static void main (String []arg){
        int n1 = 32 , n2 = 32;
        int gcd = 1;

        for(int i = 1 ; i <= n1 && i <= n2 ; ++i){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(" The GCD for " + n1 + " and " + n2 + " is " + gcd);
    }
    
}

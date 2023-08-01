public class root {
    public static void main(String [] arg){
        double a = 2.3 , b = 4 , c = 5.6 ;
        double root1 , root2 ; 

        double det = b * b - 4 * a * c ; 

        if (det > 0){
            root1 = (-b + Math.sqrt(det)) / (2 * a);
            root2 = (-b - Math.sqrt(det)) / (2 * a);

            System.out.format(" root1 = %d and root2 = %d" , root1 , root2);
        }
        else if (det == 0){
            root1 = root2 = -b / 2 * a ;
            
            System.out.format("root1 = root2 = %d" , root1 );

        }
        else{
            
            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-det) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }



    }
}

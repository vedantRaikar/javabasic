abstract class shapes{

    abstract void area();

}

class square extends shapes{
    int a ;
    square(int a){
        this.a = a ;
    }

    void area(){
      int ar = a*a;
      System.out.println("the area is:" + ar);
    }

}

class rectangle extends shapes{
    int a , b ; 
    rectangle(int a , int b){
        this.a = a ; 
        this.b = b;
    }

    void area(){
        int ar = a * b; 
        System.out.println("the area is:" + ar);
    }
}

class triangle extends shapes{
    int a , b ; 
    triangle(int a , int b){
        this.a = a ; 
        this.b = b;
    }

    void area(){
        int ar = (a * b)/2 ;
        System.out.println("the area is:" + ar);
    }
}


public  class figure {
    public static void main(String []args){
        square s = new square(2);
        rectangle r = new rectangle(2, 3);
        triangle t = new triangle(2, 3);

        s.area();
        r.area();
        t.area();
    }
    
}


class person {
    private String name ;
    private String birthdate ; 



    person(){
        name = null ;
        birthdate = null;
    }

    person(String name , String birthdate){
        this.name = name ;
        this.birthdate = birthdate ;
    }

    public String get_name(){
        return name ;
    }

    public String get_birthdate(){
        return birthdate ;
    }



    
}


class graduate extends person {
     private int gpa ; 
     private int gyear ;
    
    graduate(String name , String birthdate , int gpa , int gyear){
        super(name , birthdate);
        this.gpa = gpa ; 
        this.gyear = gyear ; 

    }

    public int get_gpa(){
        return gpa;
    }

    public int graduate_year(){
        return gyear ;
    }


}

public class grad{
    public static void main(String [] args){
       person p1 = new person();
       graduate g1 = new graduate("vedant","32-2-1212", 29 , 2020);
       person p2 = new person("akshi" , "12-12-1212");

       System.out.println("the details of p1 :" +p1.get_name()+" "+ p1.get_birthdate());
       System.out.println("the details of g1 :" +g1.get_name()+" "+ g1.get_birthdate()+" "+ g1.get_gpa()+" "+ g1.graduate_year());
       System.out.println("details of p2: " +p2.get_name()+" "+ p2.get_birthdate());
    }
}






import java.lang.*;
class A extends Thread{
    int count1 ; 
    private volatile boolean flag1 = true ; 
    public void run(){
        while(flag1){
            count1++;
        }
    }
    public void stop1(){
        flag1 = false ;
    }
}

class B extends Thread {
    int count2 ; 
    private volatile  boolean flag2 = true ; 
    public void run(){
        while(flag2) {
            count2++;
        }
    }
    public void stop1(){
        flag2 = false ;
    }
}



public class threads {
    public static void main(String [] args){
        A threadA = new A();
        B threadB = new B();
        threadB.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        System.out.println("start thread A ");
        threadA.start();
        System.out.println("start thread B"); 
        threadB.start();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted ");
        }

        threadA.stop1();
        threadB.stop1(); 

        System.out.println("High-priority thread" + threadB.count2);
        System.out.println("Low-priority thread " + threadA.count1);
        System.out.println("End the main thread.");

    }
    
}

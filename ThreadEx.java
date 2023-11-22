
 class X implements Runnable {

    public void run(){
        System.out.println("this is run method of x class");
          for(int i=10; i<=15;i++){
            System.out.println("X  "+i);
        }
    }

    
}

 class Y implements Runnable{

    public void run(){
        System.out.println("this is run method of y class");
        for(int i=20; i<=25;i++){
            System.out.println("Y  "+i);
        }
    }
    
}

class Z extends Thread{
    public void run(){
        System.out.println("this is run method of Z class  " );
        for(int i=11; i<=20;i++){
            System.out.println("Z  "+i);
        }

    }
}


public class ThreadEx {

    public static void main(String[] args) {
        X x=new X();
        Y y= new Y();
        Thread thread1 = new Thread(x);
        Z z=new Z();
       // z.start();
        thread1.start();
        
        Thread  thread2 = new Thread(y);
        thread2.start();


       

    }


    
}

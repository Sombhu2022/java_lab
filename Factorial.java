import java.util.Scanner;

class Factorial{
    public static void main(String args[]){
      
       System.out.println("Enter the number:");
       Scanner input = new Scanner(System.in);
       int a=input.nextInt();
       input.close();
       int f=1;
       for(int i=1 ; i<=a;i++)
       {
        f *= i;
      
        }

       System.out.println("factorial value is " + f);
    }
}
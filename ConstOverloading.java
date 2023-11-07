
/*********** constractor overloading ********** */
public class ConstOverloading {
    int sum;
    ConstOverloading(int a , int b){
        sum=a+b;
    }
    ConstOverloading(int a , int b , int c){
        sum = a+b+c;
    }
    public static void main(String[] args) {
        ConstOverloading obj1 = new ConstOverloading(10, 20);
        ConstOverloading obj2 = new ConstOverloading(10, 20, 30);
        System.out.println("add two number : "+obj1.sum);
        System.out.println("add three number : "+obj2.sum);
    }
}


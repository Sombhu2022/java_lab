public class CallByValue {
    public static void main(String[] args) {
         int n =90;
         System.out.println("before calling method , n="+n);
         System.out.println("call by value ...");
         n =fun(n);
         System.out.println("after calling Method , n="+n);

    }
    static int fun(int n){
        n=  200 ;
        return n;
    }
    
}

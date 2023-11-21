public class ThrowExample {

    public static void Access(int password) throws ArithmeticException {
        if(password<=0){
            throw new ArithmeticException("Access denied");
        }
        else{
            System.out.println("Access granted");   
        }
    }
   public static void main(String[] args) {
        System.out.println("when password more then 0 then :");
        Access(1);
        System.out.println("when password is 0 :");
        Access(0);
   }
}

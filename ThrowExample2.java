
/**
 * InnerThrowExample2
 */          
class InnerThrowExample2 extends ArithmeticException {
          InnerThrowExample2(String message){
            super(message);
          }
}

public class ThrowExample2 {

    public static void main(String[] args) {
        int pass=0;
        try {
            if(pass<=0){
                throw new InnerThrowExample2("password not correct");
            }
            System.out.println("ok Access grarented");
        } catch (InnerThrowExample2 e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
    
}

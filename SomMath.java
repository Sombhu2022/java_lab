package s;
public class SomMath {
    public static int Mul(int a , int b) {
        return a*b;     
    }
    public static int Div(int a , int b)
    {
        try {
            int res = a/b;
            return res;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            return 0;
        }
}
}



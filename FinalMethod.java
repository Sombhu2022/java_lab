class A{
   final void name(){
        System.out.println("sombhu das");
    }
}
class B extends A{
    void name(){
        System.out.println("som");
    }

}

public class FinalMethod {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.name());
    }
    
}

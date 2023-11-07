class Other{
    String name="sombhu das";
}

public class CallByRefarence {
    public static void main(String[] args) {
        Other obj = new Other();
        System.out.println("my name is :"+ obj.name);
        fun(obj);
        System.out.println("Updated name is :"+ obj.name);
    }
    static void fun(Other obj2){
        obj2.name="som";
    }
}

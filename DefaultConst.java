public class DefaultConst {
      String name ;
     int age;
     String me;
    int n;
    DefaultConst(){
        name="sombhu das";
        age=21;
    }
    public static void main(String[] args) {

        DefaultConst obj = new DefaultConst();
        System.out.println("when call default constractor"+obj.me + obj.n);
        System.out.println("when call default emplicate constractor  "+"name="+obj.name +"age= "+obj.age);
    }
}

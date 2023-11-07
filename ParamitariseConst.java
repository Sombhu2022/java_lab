public class ParamitariseConst {
    String name ;
    int age ;
    ParamitariseConst(String n , int a){
        name=n;
        age=a;

    }
    public static void main(String[] args) {
        ParamitariseConst obj = new ParamitariseConst("sombhu das ", 21);
        System.out.println("when call constractor by obj object"+ " name= "+obj.name + "age = "+ obj.age);
          ParamitariseConst obj1 = new ParamitariseConst("saniyaj mallik ", 21);
        System.out.println("when call constractor by obj object"+ " name= "+obj1.name + "age = "+ obj1.age);
          ParamitariseConst obj2 = new ParamitariseConst("pritam paul ", 21);
        System.out.println("when call constractor by obj object"+ " name= "+obj2.name + "age = "+ obj2.age);
    }
}

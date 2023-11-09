/**
 * InnerAbstract
 */
 abstract class Som {
    abstract int sum(int a, int b);
    
}
//we can not create object on Abstact class .
 class Abstract extends Som{
  int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
      Abstract obj=new Abstract(); 
        System.out.println(obj.sum(1,2));
    }
}



/**
 * InterFace
 */
 interface Inter{
 int x=90;
 void fun();
}

 class InterFace implements Inter{

    public static void main(String[] args) {
       Inter inter;
        inter.fun();
    }
}


public class stringBufferMethod {
     
      public static void main(String[] args) {
        
           StringBuffer str = new StringBuffer(" sombhu das ");
           System.out.println(str.length()); 
           System.err.println(str.capacity());
           str = str.append(" sring is very large ");
           System.out.println(str);
           System.out.println( str.length());
           System.out.println(str.capacity());

           String copy = str.toString();
           System.out.println(copy);
           System.out.println(copy.length());
        //    System.err.println(copy.capacity()); // return error 

          str.insert(3, "som");
          System.out.println(str);

          str.delete(12,30);
          System.out.println(str);

          str.deleteCharAt(3);
          System.out.println(str);

          str.replace(3, 16, "mbhu das");
          System.out.println(str);

          str.reverse();
          System.out.println(str);
 
      }

}

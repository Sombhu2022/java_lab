public class stringMethods {
    public static void main(String[] args) {
        String str = new String(" sombhu das ");
        System.out.println(str.length());
        System.out.println(str.trim()); // return string with out cotain  extra space .
        System.out.println(str.charAt(4)); // return char , using input index .
        System.out.println(str.indexOf("das")); // return starting index of  the given string .
        System.out.println(str.indexOf('a', 5));// return index of a , but itaration starting in index of 5 .
        System.out.println(str.substring(2, 4)); //return substrindg of the string starting at 2 and ending index is 4.
        System.out.println(str.replace('o', 'a')); // 
        System.out.println(str.replace("som", "sham"));
        // System.out.println(str.replace('o', "ha")); // return error , chat is not change into string .
        String  str2="mca student";

        System.out.println(str.concat(str2));  // concatination 
        int  b=12090;
        System.out.println(b);
        String j= String.valueOf(b); // return any type to string . 
        System.out.println(j+ "   "+j.getClass()); // return type of the variable in java ....

    }
    
}

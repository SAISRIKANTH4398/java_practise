class stringMethods {
    public static void main(String[] args){
        String str1 = "Sai";
        String str2 = "Srikanth";
        int value = 1;
        System.out.println((str1.concat(str2))+value);  //It can also concat value with a String
        System.out.println(str2.length());  // To check the length of the string
        System.out.println(str2.charAt(0));  // To get the value of certain index
        System.out.println(str2.substring(0, 3));  /*  Slicing a string,
         If not given any end index, it considers until the last */
        System.out.println(str1.repeat(3));  // Used to repeat a string
    }
}

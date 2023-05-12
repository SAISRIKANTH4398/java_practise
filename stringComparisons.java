/*initializing Strings with new keyword
When we use new keyword, new memory is allocated.

*/

class stringComparisons {
    public static void main(String[] args){
        String a = new String("ABC");
        String b = new String("ABC");
        String c = new String("abc");
        String d = "A";
        String e = "B";
        System.out.println(a.equals(b)); //returns true
        System.out.println(a==b);  //returns false because memory is different for 2 variables
        System.out.println(a.equalsIgnoreCase(c)); //returns true because it ignores case
        System.out.println(d.compareTo(e));  
        /*Compare to operator compares the unicode values of 2 strings. 
        Returns 1 if str1>str2, 
        0 if str1==str2
        -1 if str1<str2 */

        /*Another method compareToIgnoreCase() does the same thing as compareTo() but ignores the case. */

        System.out.println('A'>'B'); //returns false because unicode of A is lesser than unicode of B

    }
}


class MathOps{
    public static void main(String[] args){
        int a = 6;
        int b = 3;
        float c = 24.678f;
        double d = 284.56d;
        double result = Math.pow(a,b);  //Math class provides diff math operations
        System.out.println(result);    // Pow means power, a power b, returns double type even we pass int.
        // Returns 1 if second parameter is 0.

        int round = Math.round(c);
        long rounded = Math.round(d);
        System.out.println(round);
        System.out.println(rounded);
    }
}
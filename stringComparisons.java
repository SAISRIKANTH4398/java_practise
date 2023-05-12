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

        
    }
}

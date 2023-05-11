/*initializing Strings with new keyword
When we use new keyword, new memory is allocated.

*/

class stringComparisons {
    public static void main(String[] args){
        String a = new String("ABC");
        String b = new String("ABC");
        System.out.println(a.equals(b)); //returns true
        System.out.println(a==b);  //returns false because memory is different for 2 variables

    }
}

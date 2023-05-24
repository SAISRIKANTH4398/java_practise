/*Unary Operators are operators that operate upon a single operand and produce a new value.
 * 1.Increment Operator
 * 2.Decrement operator
 * 
 * 1.1/2.1 Prefix: ++x/--x Variable's value incremented/decremented first and then updated value is used.
 */

class prefix{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        ++a;               //a=11
        --b;               //b=19
        int number = ++a;   //a=12, number=12
        int num = --b;      //num=18, b=18
        System.out.println(a);
        System.out.println(number);
        System.out.println(num);
        System.out.println(b);
    }
}


/*1.2/2.2 Postfix: x++/x--:  in Postfix, variable's value is first used for computing the result then 
incremented/decremented  */


class postfix{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        a++;               //a=11
        b--;               //b=19
        int number = a++;   //a=12, number=11
        int num = b--;     //b=18, num =19
        System.out.println(a);
        System.out.println(number);
        System.out.println(num);
        System.out.println(b);
    }
}
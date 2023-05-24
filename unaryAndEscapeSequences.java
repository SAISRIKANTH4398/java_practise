/*Unary Operators are operators that operate upon a single operand and produce a new value.
 * 1.Increment Operator
 * 2.Decrement operator
 * 
 * 1.1 Prefix: ++x Variable's value incremented first and then updated value is used.
 */

class prefix{
    public static void main(String[] args){
        int a = 10;
        ++a;               //a=11
        int number = ++a;   //a=12, number=12
        System.out.println(a);
        System.out.println(number);
    }
}
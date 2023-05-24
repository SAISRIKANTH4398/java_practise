/*Unary Operators are operators that operate upon a single operand and produce a new value.
 * 1.Increment Operator
 * 2.Decrement operator
 * 
 * 1.1/2.1 Prefix: ++x Variable's value incremented/decremented first and then updated value is used.
 */

class prefix{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        ++a;               //a=11
        --b;
        int number = ++a;   //a=12, number=12
        int num = --b;
        System.out.println(a);
        System.out.println(number);
        System.out.println(num);
    }
}
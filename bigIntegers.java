/*In general, integers and long can store numbers in the range (-2^31-1 to 2^31-1) and (-2^63-1 to 2^63-1) respectively.
 * But In real world sceneraios, we may have to store numbers larger than these ranges.
 * Hence we use Big Integers.
 */

/*Big Int is a class which involve very big mathematical operations that are not in the limit of all
 primitive datatypes */
 import java.math.BigInteger;

public class bigIntegers {
   public static void main(String[] args){
    String str = "35593696540923939295459856";
    BigInteger BigNum = new BigInteger(str);  //Declaring and initializing Big Integers
    System.out.println(BigNum);
   }
}

class bigIntMethods{
    public static void main(String[] args){
        BigInteger BigNum = new BigInteger("5406306283549856929329");
        BigInteger BigNum2 = new BigInteger("3493845893602434835865");
        BigInteger BigNum1 = new BigInteger("456");
        BigInteger BigNum3 = new BigInteger("-13283848548540");
        int exp = 17;
        BigInteger power = BigNum1.pow(exp);
        BigInteger sum = BigNum.add(BigNum2);
        BigInteger difference = BigNum.subtract(BigNum2);
        BigInteger mulitply = BigNum.multiply(BigNum2);
        BigInteger division = BigNum.divide(BigNum2);
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(mulitply);
        System.out.println(division);
        System.out.println(power);
        System.out.println(BigNum3.abs());
    }
}


class BigIntTypeConversions{
    public static void main(String[] args){
        int num = 2022;
        long longNum = 435468567463L;

        BigInteger bigNum1 = BigInteger.valueOf(num);  
        BigInteger bigNum2 = BigInteger.valueOf(longNum);

        System.out.println(bigNum1);
        System.out.println(bigNum2);
        num = bigNum1.intValue();

        System.out.println(num);
        String str = "45900";
        BigInteger bigNum3 = new BigInteger(str);

        str = bigNum3.toString();
        long longNum1 = bigNum3.longValue();
        float floatNum = bigNum3.floatValue();
        double doubleNum = bigNum3.doubleValue();

        System.out.println(str);
        System.out.println(longNum1);
        System.out.println(floatNum);
        System.out.println(doubleNum);
    }
}

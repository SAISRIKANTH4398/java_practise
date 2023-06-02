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
        BigInteger sum = BigNum.add(BigNum2);
        BigInteger difference = BigNum.subtract(BigNum2);
        System.out.println(sum);
        System.out.println(difference);
    }
}

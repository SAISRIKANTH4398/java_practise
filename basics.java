import java.util.Scanner;

class IoBasics {
    public static void main(String[] args){
        Scanner sc_str = new Scanner(System.in); //scanning input
        int num = sc_str.nextInt();  //reading an Int value
        String person = sc_str.next();  // reads string value that is after first white spaces
        String name = sc_str.nextLine(); // reads string values
        System.out.println(num);
        System.out.println(name);
        System.out.println(person);
        sc_str.close();
    }
}
/*nextFloat, nextBoolean(), nextLong() etc., */
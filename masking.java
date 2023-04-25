import java.util.Scanner;

class Masking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int length = input.length();  //Masking input with *
        String result = input.charAt(0)+"*".repeat(length-2)+input.charAt(length-1);
        System.out.println(result);
        sc.close();
    }
}
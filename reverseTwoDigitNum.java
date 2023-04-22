import java.util.Scanner;
class reverseTwoDigitNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char a = num.charAt(0);
        char b = num.charAt(1);
        System.out.print(b);
        System.out.print(a);
        sc.close();
    }
}

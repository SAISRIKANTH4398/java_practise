import java.util.Scanner;

class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int hundreds = N/100;
        N = N%100;
        int fifties = N/50;
        N = N%50;
        int tens = N/10;
        N = N%10;
        int ones = N;
        System.out.println("100:"+hundreds);
        System.out.println("50:"+fifties);
        System.out.println("10:"+tens);
        System.out.println("1:"+ones);
        sc.close();
    }
}
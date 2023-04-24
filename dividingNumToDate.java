import java.util.Scanner;
class dividingNumToDate {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int year = N/365;
    N = N%365;
    int week = N/7;
    int day = N%7;
    System.out.println(String.format("%d years", year));
    System.out.println(String.format("%d Weeks", week));
    System.out.printf("%d days",day);
    sc.close();
    }

}

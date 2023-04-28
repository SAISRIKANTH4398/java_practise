import java.util.Scanner;

class Main4 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        if(Y%100==0){
            if(Y%400==0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else if(Y%4==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}

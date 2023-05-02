import java.util.Scanner;

class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int smaller = a<b?a:b;
        int gcd = 0; 
        for(int i=1; i<=smaller; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        sc.close();
    }
}

class lcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = a>b?a:b;
        for(int i=greater; i<=a*b; i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
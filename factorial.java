import java.util.Scanner;

class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        long product = 1;
        int n=1;
        do{
            product=product*n;
            n=n+1;
            if(M==0){
                product=1;
            }
        }while(n<=M);
        System.out.println(product);
        sc.close();
    }
}
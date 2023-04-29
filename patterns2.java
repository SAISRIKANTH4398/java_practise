import java.util.Scanner;

class hollowSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if(i==1 || i==N){
                System.out.println("* ".repeat(N));
            }else{
                System.out.println("* "+"  ".repeat(N-2)+"*");
            }
        }
        sc.close();
    }
}
import java.util.Scanner;
class numberDiamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=2*N-1; i++){
            if(i<=N){
                System.out.print(" ".repeat(N-i));
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }else{
                System.out.print(" ".repeat(i-N));
                for(int k=1; k<=2*N-i;k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
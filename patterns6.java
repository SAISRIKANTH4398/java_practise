import java.util.Scanner;

class halfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            if(i==1){
                System.out.println(1);
            }else if(i==N){
                for(int j=1; j<=N; j++){
                    System.out.print(j+" ");
                }
            }else{
                System.out.println(1+" "+"  ".repeat(i-2)+i);
            }
        }
        sc.close();
    }
}


class invertedPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if(i==1){
                for(int j=1;j<=N;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            else if(i==N){
                System.out.println(" ".repeat(N-1)+1);
            }else{
                System.out.println(" ".repeat(i-1)+(1)+" "+"  ".repeat(N-i-1)+(N-i+1));
            }
        }
        sc.close();
    }
}


class invertedTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.println(" ".repeat(i-1)+"* ".repeat(N-i+1));
        }
        sc.close();
    }
}
import java.util.Scanner;

class invertedRightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            System.out.println("  ".repeat(i)+"* ".repeat(N-i));
        }
        sc.close();
    }
}


class noInSquarePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for(int i=1; i<=M; i++){
            for(int j=1; j<=M;j++){
                System.out.print(String.valueOf(j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

class noInSqurPattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for(int i=1; i<=M; i++){
            for(int j=1; j<=M;j++){
                System.out.print(String.valueOf(i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}


class solidDiamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for(int i=1; i<=2*M-1; i++){
            if(i<=M){
                System.out.println(" ".repeat(M-i)+"* ".repeat(i));
            }else{
                System.out.println(" ".repeat(i-M)+"* ".repeat(2*M-i));
            }
        }
        sc.close();
    }
}

class halfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
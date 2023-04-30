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


class hollowRightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            if(i==0){
                System.out.println("* ".repeat(N));
            }else if(i==N-1){
                System.out.println("  ".repeat(N-1)+"*");
            }
            else{
                System.out.println("  ".repeat(i) + "* "+"  ".repeat(N-i-2)+"*");
            }
        }
        sc.close();
    }
}

class hollowRightTriangle2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            if(i==N-1){
                System.out.println("* ".repeat(N));
            }else if(i==0){
                System.out.println("  ".repeat(N-1)+"*");
            }
            else{
                System.out.println("  ".repeat(N-i-1) + "* "+"  ".repeat(i-1)+"*");
            }
        }
        sc.close();
    }
}

class RightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            System.out.println("  ".repeat(N-i-1)+"* ".repeat(i+1));
        }
        sc.close();
    }
}
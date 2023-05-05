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


class digit8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=2*N+1;i++){
            if(i==1 || i==N+1 || i==2*N+1){
                System.out.println("* ".repeat(N));
            }else{
                System.out.println("* "+"  ".repeat(N-2)+"*");
            }
        }
        sc.close();
    }
}


class halfDiamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=2*N-1;i++){
            if(i<=N){
                System.out.println("* ".repeat(i));
            }else{
                System.out.println("* ".repeat(2*N-i));
            }
        }
        sc.close();
    }
}


class fullPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.println("0 ".repeat(N-i)+ "1 ".repeat(2*N-1-2*(N-i))+"0 ".repeat(N-i));
            
        }
        sc.close();
    }
}


class butterfly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=2;i++){
            if(i==1){
                for(int j=1; j<=N;j++){
                    System.out.println("* ".repeat(j)+"  ".repeat(2*(N-j))+"* ".repeat(j));
                }
            }else{
                for(int k=N; k>=1;k--){
                    System.out.println("* ".repeat(k)+"  ".repeat(2*(N-k))+ "* ".repeat(k));
                }
            }
        }
        sc.close();
    }
}


class digit9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=2*N-1; i++){
            if(i==1 || i==N || i==2*N-1){
                System.out.println("* ".repeat(N));
            }else if(i>1 && i<N){
                System.out.println("* "+ "  ".repeat(N-2)+"*");
            }else{
                System.out.println("  ".repeat(N-1)+"*");
            }
        }
        sc.close();
    }
}


class pyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.println(". ".repeat(N-i)+"0 ".repeat(2*i-1)+". ".repeat(N-i));
        }
        sc.close();
    }
}


class WwithStar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if(i==1){
                System.out.println("* ".repeat(2*N-1));
            }else{
                System.out.println(" ".repeat(i-1)+"* ".repeat(N-i+1)+"  ".repeat(i-2)+"* ".repeat(N-i+1));
            }
        }
        sc.close();
    }
}
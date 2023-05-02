import java.util.Scanner;

class hollowHalfPyram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if(i==N || i==1){
                System.out.println("* ".repeat(i));
            }else{
                System.out.println("* "+"  ".repeat(i-2)+"* ");
            }
        }
        sc.close();
    }
}


class hollowHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if(i==1){
                for(int j=1; j<=N; j++){
                    System.out.print(j+" ");
                }
            }else{
                if(i==N){
                    System.out.print(1);
                }else{
                System.out.print(1+" "+"  ".repeat(N-i-1)+(N-i+1));}
            }
            System.out.println();
            }
        sc.close();
    }
}


class hollowPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            if(i==1){
                System.out.println(" ".repeat(N-i)+"*");
            }else if(i==N){
                System.out.println("* ".repeat(N));
            }else{
                System.out.println(" ".repeat(N-i)+"* "+"  ".repeat(i-2)+"*");
            }
        }
        sc.close();
    }
}


class invertedHalfPyr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            if(i==1 || i==N){
                System.out.println("* ".repeat(N-i+1));
            }else{
                System.out.println("* "+"  ".repeat(N-i-1)+"*");
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
                System.out.println("* ".repeat(N-i+1));
            }else if(i==N){
                System.out.println(" ".repeat(i-1)+"*");
            }
            else{
                System.out.println(" ".repeat(i-1)+"* "+"  ".repeat(N-i-1)+"*");
            }
        }
        sc.close();
    }
}
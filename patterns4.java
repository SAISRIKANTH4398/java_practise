import java.util.Scanner;

class halfPyramid2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=1;
        for(int i=1; i<=N; i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}


class halfPyramid3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count=N;
        for(int i=1; i<=M; i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}


class halfPyramid4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=M){
            sum=sum+i;
            i++;
        }
        int startNo=sum+N-1;
        for(int k=1; k<=M; k++){
            for(int j=1;j<=k;j++){
                System.out.print(startNo+" ");
                startNo--;
            }
            System.out.println();
        }
        sc.close();
    }
}


class fullPyramid{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1; i<=N;i++){
            System.out.print(" ".repeat(N-i));
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

class invertedHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N ; i++){
            System.out.println("* ".repeat(N-i+1));
        }
        sc.close();
    }
}
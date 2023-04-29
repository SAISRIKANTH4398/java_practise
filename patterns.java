import java.util.Scanner;

class solidSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int i = 1;
        while(i<=M){
            System.out.println("* ".repeat(M));
            i++;
        }
        sc.close();
    }
}

class solidRightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int i = 1;
        while(i<=M){
            System.out.println("* ".repeat(i));
            i++;
        }
        sc.close();
    }
}

class solidRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int counter = 1;
        do{
            System.out.println("+ ".repeat(N));
            counter++;
        }while(counter<=M);
        sc.close();
    }
}


class solidRightTriangle2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int i = 1;
        while(i<=M){
            System.out.println(("  ".repeat(M-i))+("* ".repeat(i)));
            i++;
        }
        sc.close();
    }
}
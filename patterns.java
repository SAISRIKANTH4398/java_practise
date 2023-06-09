import java.util.Scanner;

//Program to print solid square with *
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

//Program to print solid right triangle using *
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

//Program to print a solid rectangle using +
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


// Program to print solid right triangle using *
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

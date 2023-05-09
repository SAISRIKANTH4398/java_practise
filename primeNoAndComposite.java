import java.util.Scanner;

class primeNoAndComposite{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=2; i<N; i++){
            if(N%i==0){
                count+=1;
            }
        }
        if(count>0){
            System.out.println("Not a Prime Number");
        }else{
            System.out.println("Prime Number");
        }
        sc.close();
    }
}

class compositeNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int count=0;
        for(int i=2; i<M; i++){
            if(M%i==0){
                count += 1;
            }
        }
        if(count==0){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
        sc.close();
    }
}


class PrimeNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        for(int i=M; i<=N;i++){
            int count = 0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}


class compositeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        for(int i=M; i<=N; i++){
            int count=0;
            for(int j=2;j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}


class firstPrimeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int a = sc.nextInt();
            int count = 0;
            for(int j=1;j<=a; j++){
                if(a%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(a);
                break;
            }
        }
        sc.close();
    }
}
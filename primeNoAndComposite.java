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
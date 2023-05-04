import java.util.Scanner;
class largestFactor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int count=0;
        for(int i=N; i>=1; i--){
            if(N%i==0){
                count+=1;
                if(count==a){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
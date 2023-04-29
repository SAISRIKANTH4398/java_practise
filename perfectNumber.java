import java.util.Scanner;

class perfectNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for(int i=1; i<input; i++){
            if(input%i==0)
            sum = sum+i;
        }
        if(sum==input){
            System.out.println("Perfect Number");
        }else{System.out.println("Not a Perfect Number");}
        sc.close();
    }
}
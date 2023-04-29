import java.util.Scanner;

class sumOfSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long result = 0;
        for(int i =1; i<=num; i++){
            result = result+Long.valueOf(("2".repeat(i)));
        }
        System.out.println(result);
        sc.close();
    }
}
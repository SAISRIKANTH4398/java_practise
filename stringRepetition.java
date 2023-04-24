import java.util.Scanner;

class stringRepetition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num = sc.nextInt();
        int length = word.length();
        String resultWord = word.substring(length-3);
        int i = 0;
        while (i<num){
            System.out.print(resultWord);
            i = i+1;
        }
        sc.close();
    }
}
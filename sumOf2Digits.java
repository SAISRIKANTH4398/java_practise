import java.util.Scanner;

class sumOf2Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int result = 0;
        int i = 0;
        while(i<num.length()){
            result = result + Character.getNumericValue(num.charAt(i));
            i=i+1;
        }
        System.out.println(result);
        sc.close();
    }
}
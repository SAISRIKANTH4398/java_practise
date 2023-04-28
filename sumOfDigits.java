import java.util.Scanner;

class Main5 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); //
        String N = sc.next();
        int length = N.length();
        int i = 0;
        int output = 0;
        while(i<length){
            output = output+Character.getNumericValue(N.charAt(i));
            i = i+1;
        }
        System.out.println(output);
        sc.close();
    }
}
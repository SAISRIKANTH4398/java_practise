import java.util.Scanner;

class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().toLowerCase();
        String output = "";
        for(int i=0; i<N.length(); i++){
            output = N.charAt(i)+output;
        }
        if(N.equals(output)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
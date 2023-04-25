import java.util.Scanner;

class SkipLetter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int num = sc.nextInt();
        String output;
        if (num==input.length()){
            output = input.substring(0,num);  //Skipping letters of given index
        }
        else{
            output = input.substring(0,num) + input.substring(num+1);
        }
        System.out.println(output);
        sc.close();
    }
}
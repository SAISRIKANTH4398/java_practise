import java.util.Scanner;

class validatePsswd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int length = input.length();
        System.out.println(length>7?"True":"False"); //If length greater than 7 then true
        sc.close();  //Using terinary operator
    }
}
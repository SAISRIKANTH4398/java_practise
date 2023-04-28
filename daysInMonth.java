import java.util.Scanner;
class Main3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        switch(input){
            case "February":
                System.out.println("28");
                break;
            case "April":
                System.out.println("30");
                break;
            case "June":
                System.out.println("30");
                break;
            case "September":
                System.out.println("30");
                break;
            case "November":
                System.out.println("30");
                break;
            default:
                System.out.println("31");
                break;
        }
        sc.close();
    }
}
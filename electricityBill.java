import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float bill;
        if(a<=50){
            bill = a*2;
            System.out.println(bill+0.2*bill); //20% Surcharge
        }
        else if(a>50 && a<=150){       //Based on different units
            bill = 100+(a-50)*3;
            System.out.println(bill+0.2*bill);
        }
        else if(a>150 && a<=250){
            bill = 400 + (a-150)*5;
            System.out.println(bill+0.2*bill);
        }
        else{
            bill = 900+(a-250)*8;
            System.out.println(bill+0.2*bill);
        }
        sc.close();
    }
}
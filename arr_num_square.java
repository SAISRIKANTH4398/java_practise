/*Program to square each element in an array*/

import java.util.Scanner;

class arr_num_square {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int size = num.nextInt();
        int[] num_seq = new int[size];
        int index = 0;
        while (index<size){
           num_seq[index] = num.nextInt();
           index = index + 1;
        }
        for(int eachItem:num_seq){
            System.out.print(eachItem*eachItem+" ");
        }
        num.close();
    }
}

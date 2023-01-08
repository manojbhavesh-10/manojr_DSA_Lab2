package dsa.labsesion_2.transaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of transaction array ");
        int size = in.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the values of array ");

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("enter the total no of targets that needs to be achieved ");
        int targetNo = in.nextInt();

        Transaction trans = new Transaction();

        for(int i = 0; i < targetNo; i++) {
            System.out.println("Enter the value of target ");
            long target = in.nextInt();

            int check = trans.transactionService(array, target);

            if(check > 0) {
                System.out.println("Target achieved after " + check + " transactions\n");
            } else {
                System.out.println("Given target is not achieved ");
            }
        }

    }

}

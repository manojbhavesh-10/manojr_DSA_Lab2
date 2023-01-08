package dsa.labsesion_2.currencydenomination.driver;

import dsa.labsesion_2.currencydenomination.service.MergeSort;
import dsa.labsesion_2.currencydenomination.service.NotesCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        MergeSort sort = new MergeSort();
        NotesCount noCount = new NotesCount();

        System.out.println("Enter the size of currency denomination: ");
        int size = in.nextInt();

        int[] currency = new int[size];
        System.out.println("Enter the currency denominations value: ");
        for(int i = 0; i < currency.length; i++) {
            currency[i] = in.nextInt();
        }

        System.out.println("Enter the amount you want to pay: ");
        int amount = in.nextInt();

        sort.mergeSort(currency, 0, currency.length);

        noCount.notesCount(currency, amount);



    }
}

package dsa.labsesion_2.transaction;


public class Transaction {
    public int transactionService(int[] array, long target) {
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if(sum >= target) {
                return (i + 1);
            }
        }
        return 0;
    }
}

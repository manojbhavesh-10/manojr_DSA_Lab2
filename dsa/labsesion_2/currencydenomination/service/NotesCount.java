package dsa.labsesion_2.currencydenomination.service;

public class NotesCount {

    public void notesCount(int[] currency, int amount) {
        int[] noteCounter = new int[currency.length];

        for(int i = 0; i < currency.length; i++) {
            if(amount >= currency[i]) {
                noteCounter[i] = amount / currency[i];
                amount = amount - currency[i] * noteCounter[i];
            }
        }

        if(amount > 0) {
            System.out.println("Exact amount cannot be given with the highest denomination ");
        } else {
            System.out.println("Your payment approach in order to give min no of note will be ");
            for(int i = 0; i < currency.length; i++) {
                if(noteCounter[i] != 0) {
                    System.out.println(currency[i] + " : " + noteCounter[i]);
                }
            }
        }
    }
}

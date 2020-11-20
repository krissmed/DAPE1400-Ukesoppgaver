package ArtimetikkOgLogiskeUtrykk;

/*Lag et program som definerer en variabel int antall=0. Skriv så ut partallene mellom 0 og 10 (2,4,6,8) ved å øke variabelen med 2 mellom hver gang.*/


public class oppgave2 {
    public static void main(String[] args) {
        int tall = 0;
        String ut = "";
        while (tall < 9){
            tall++;
            if(tall % 2 == 0){
                ut += tall + ",";
            }
        }
        System.out.print(ut);
    }
}

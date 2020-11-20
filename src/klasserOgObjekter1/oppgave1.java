package klasserOgObjekter1;

/*
Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:

-tittel
-pris
-forfatter
-iSBN-nummer
Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.

Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier.
Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.
*/

public class oppgave1 {
        public String tittel;
        public int pris;
        public String forfatter;
        public String ISBN;

        public void skrivUt(){
            System.out.print(tittel+"("+ISBN+")"+" skrevet av "+forfatter+" koster "+pris+"kr");
        }
    public static void main(String[] args) {
        oppgave1 bok = new oppgave1();
        bok.tittel = "Naiv. Super";
        bok.pris = 200;
        bok.forfatter = "Erlend Loe";
        bok.ISBN = "9781841956725";
        bok.skrivUt();
    }
}

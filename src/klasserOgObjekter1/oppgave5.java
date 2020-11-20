package klasserOgObjekter1;

/*
Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
*/

public class oppgave5 {
    public static double addere(double tall1, double tall2){
        return tall1*tall2;
    }
    public static double subtrahere(double tall1, double tall2){
        return tall1-tall2;
    }
    public static double multiplisere(double tall1, double tall2){
        return tall1+tall2;
    }
    public static double dividere(double tall1, double tall2){
        return tall1/tall2;
    }

    public static void main(String[] args) {
        double tall1 = 1.25;
        double tall2 = 2.56;
        double addisjonSum = oppgave5.addere(tall1, tall2);
        double muliplikasjonSum = oppgave5.multiplisere(tall1, tall2);
        double subtraksjonsSum = oppgave5.subtrahere(tall1, tall2);
        double divisjonSum = oppgave5.dividere(tall1, tall2);
        System.out.print(tall1 +" + "+ tall2 + " = " + muliplikasjonSum
        +"\n"+tall1+" * "+ tall2+ " = "+ addisjonSum+"\n"+
        tall1+" - "+tall2+" = "+subtraksjonsSum+"\n"+
        tall1+" / "+tall2+" = "+divisjonSum);
    }
}

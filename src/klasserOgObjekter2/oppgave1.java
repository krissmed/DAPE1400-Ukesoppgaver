package klasserOgObjekter2;
/*
Lag en klasse «Person» med følgende private attributter:

        fornavn
        etternavn
        adresse
        telefonnr
        Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

        Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.

        Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.
        */

        import javax.swing.*;

public class oppgave1 {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public String getFornavn(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public String getAdresse(){
        return adresse;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Hva er fornavnet ditt?");
        String etternavn = JOptionPane.showInputDialog("Hva er etternavnet ditt?");
        String adresse = JOptionPane.showInputDialog("Hva er adressen din?");
        String telefonnr = JOptionPane.showInputDialog("Hva er telefonnummeret ditt?");

        oppgave1 kristian = new oppgave1();
        kristian.setAdresse(adresse);
        kristian.setFornavn(fornavn);
        kristian.setEtternavn(etternavn);
        kristian.setTelefonnr(telefonnr);
        JOptionPane.showMessageDialog(null,kristian.getFornavn() + kristian.getEtternavn() + " bor i " + kristian.getAdresse() + " og kan kontakes på " + kristian.getTelefonnr());

    }
}

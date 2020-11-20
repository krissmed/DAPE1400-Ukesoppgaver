package klasserOgObjekter2;
/*
Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:

        Bensinstasjonens sted (en streng)
        Type bensin (en streng)
        Antall liter fylt (et desimaltall)
        Prisen pr. liter (et desimaltall)
        Tidspunkt fylt (en streng)
        Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse. Lag så en metode finnTotalPrisen. Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall. Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

        Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
        */


public class oppgave3 {
    private String bensinstasjonensSted;
    private String typeBensin;
    private double antallLiter;
    private double prisLiter;
    private String tidspunkt;

    private void setBensinstasjonensSted(String bensinstasjonensSted){
        this.bensinstasjonensSted = bensinstasjonensSted;
    }

    private void setTypeBensin(String typeBensin){
        this.typeBensin = typeBensin;
    }

    private void setAntallLiter(Double antallLiter){
        this.antallLiter = antallLiter;
    }

    private void setPrisLiter(Double prisLiter){
        this.prisLiter = prisLiter;
    }

    private void setTidspunkt(String tidspunkt){
        this.tidspunkt = tidspunkt;
    }

    public String getBensinstasjonensSted(){
        return bensinstasjonensSted;
    }

    public String getTypeBensin(){
        return typeBensin;
    }

    public double getAntallLiter(){
        return antallLiter;
    }

    public double getPrisLiter(){
        return prisLiter;
    }

    public String getTidspunkt(){
        return tidspunkt;
    }

    public double pris(){
        double pris = getPrisLiter();
        double liter = getAntallLiter();
        return pris*liter;
    }

    public static void main(String[] args) {
        String bensinstadjonensSted = "Økern";
        String typeBensin = "Disel";
        double antallLiter = 4.5;
        double prisLiter = 13.5;
        String tidspunkt = "12:00";

        oppgave3 test = new oppgave3();
        test.setAntallLiter(antallLiter);
        test.setBensinstasjonensSted(bensinstadjonensSted);
        test.setPrisLiter(prisLiter);
        test.setTypeBensin(typeBensin);
        test.setTidspunkt(tidspunkt);

        System.out.print("Klokken "+test.getTidspunkt()+" fylte du opp "+test.getAntallLiter()+ " for "+ test.getPrisLiter()+" kr på "+test.getBensinstasjonensSted()+". Fullpris er "+test.pris());
    }
}

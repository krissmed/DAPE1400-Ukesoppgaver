package merOmKlasserOgObjekter1;

import java.util.ArrayList;
import java.util.Date;

class Dato {
    public int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    public static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }
    @Override
    public String toString(){
        String ut = dag+"."+månedsnavn(2)+"."+år;
        return ut;
    }
}

class Bil{
    String type;
    Dato forsteGangReg;
    String skiltNr;
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    Bil(String type, Dato forsteGangReg, String skiltNr){
        this.type = type;
        this.forsteGangReg = forsteGangReg;
        this.skiltNr = skiltNr;
    }
    // lag også konstruktør for alle attributtene
    @Override
    public String toString(){
        String ut = "Register: \n";
        ut+=type+"\n";
        ut+=forsteGangReg+"\n";
        ut+=skiltNr+"\n";
        return ut;
    }
    // lag så en toString metode for å vise alle attributtene

}

public class MotorvognReg {

    public static void main(String[] args) {
        ArrayList<Bil> biler = new ArrayList<Bil>();
        Dato Dato1 = new Dato(2, 2, 2020);
        Dato Dato2 = new Dato(3, 3, 3030);
        Dato Dato3 = new Dato(4, 4, 4040);
        Bil bil1 = new Bil("Volvo", Dato1, "123345678");
        Bil bil2 = new Bil("Volvo", Dato2, "123345678");
        Bil bil3 = new Bil("Volvo", Dato3, "123345678");
        biler.add(bil1);
        biler.add(bil2);
        biler.add(bil3);
        // Sett inn noen biler i arrayet
        for (Bil enBil : biler){
            System.out.println(enBil.toString());
        }
        // List motorvognregisteret (arrayet) ved hjelp av en løkke

    }
}
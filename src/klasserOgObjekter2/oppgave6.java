package klasserOgObjekter2;

public class oppgave6 {
    private int vindhastighet;

    public String stilleOrkan(int vindhastighet){
        this.vindhastighet = vindhastighet;
        if(vindhastighet < 2){
            return "Det er vindstille";
        }else if(vindhastighet > 120){
            return  "Det er orkan";
        }
        return null;
    }

    public int beregnBeaufort(){
        int beaufort = (int) (((vindhastighet)/Math.pow(3.01, 0.66666))+5);
        return beaufort;
    }

    public static void main(String[] args) {
        oppgave6 vind = new oppgave6();
        String orkan = vind.stilleOrkan(121);
        int beaufort = vind.beregnBeaufort();
        System.out.print(orkan+", "+beaufort);
    }
}

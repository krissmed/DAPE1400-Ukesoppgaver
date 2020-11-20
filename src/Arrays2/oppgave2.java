package Arrays2;

import java.util.ArrayList;

public class oppgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for(int i=1;i<10;i++){
            arraylist.add(i);
        }
        arraylist.add(10);
        arraylist.add(11);
        arraylist.remove(1);
        arraylist.remove(1);
        for (int liste : arraylist){
            System.out.print(liste + " ");
        }
    }
}

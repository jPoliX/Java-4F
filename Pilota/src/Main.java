import java.util.Random;
import java.util.Scanner;

import static utility.Tools.*;
public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        int tempo;
        Scanner sc = new Scanner(System.in);
        try{
            Pilota p1 = new Pilota("messi", "marchetto", "Islanda");
            System.out.println(p1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        /*try {
            Cronometro cr = new Cronometro();
            tempo = rn.nextInt(0,99) + 1;
            cr.setStartTime();
            Wait(tempo);
            cr.setEndTime();
            cr.calcolaIntTimer();
            System.out.println(cr.getTempoGiro());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

        Integer n1,n2;
        n1 = 5;
        n2 = 7;
        System.out.println(n1.compareTo(n2));
    }
}
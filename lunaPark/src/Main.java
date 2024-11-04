import parco.LunaPark;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import static utility.Tools.*;
import frontScreen.*;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXPERSONE = 10;
        ArrayList<LunaPark> lunaPark = new ArrayList<>();
        String[] opzioni = {"Menu", "Entrata", "Prova Giostra", "Uscita", "Esci"};
        boolean esci = true;

        do{
            switch (Menu(opzioni, tastiera)){
                case 1 ->{
                    if(lunaPark.size() < MAXPERSONE){
                        LunaPark nuovo = frontEnd.leggiBiglietto;
                        lunaPark.add(nuovo);
                    }
                }
            }
        }while(esci);
    }
}
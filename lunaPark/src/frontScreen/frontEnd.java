package frontScreen;

import parco.Giostre;
import parco.LunaPark;
import parco.LunaPark.*;
import parco.Giostre.*;

import static utility.Tools.*;

import java.util.Random;
import java.util.Scanner;

class FrontEnd {
    public static LunaPark leggiBiglietto (Scanner tastiera){
        LunaPark nuovo = new LunaPark();

        Random random = new Random();
        nuovo.nBiglietto = random.nextInt(20);

        System.out.println("Inserisci la giostra da provare:");

        String [] opzioni = {"Giostre","1 Ruota Panoramica ","2 Autoscontro","3 Ottovolante","4 tagadà"};

        switch(Menu(opzioni,tastiera)) {
            case 1-> nuovo.tipo = Giostre.RuotaPanoramica;
            case 2-> nuovo.tipo = Giostre.Autoscontro;
            case 3-> nuovo.tipo = Giostre.Ottovolante;
            case 4-> nuovo.tipo = Giostre.Tagada;
        }
        return nuovo;
    }
}
package parco;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LunaPark {
    public int nBiglietto;
    public int nGiostre;
    public Giostre tipo;
    public LocalDate giornata;
    public LocalTime oraAccesso;
    private DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public String toString(){
        return String.format("Biglietto: %s Numero di Giostre: %s Tipo: %s Giorno: %s Ora: %s" ,nBiglietto, nGiostre, tipo, giornata.format(dataFormat), oraAccesso.format(hourFormat));
    }
}

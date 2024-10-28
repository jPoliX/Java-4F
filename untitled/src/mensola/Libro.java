package mensola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {

    public String Autore;
    public String Titolo;
    public final double PREZZOPAGINA = 0.05;
    public int pagine;
    public LocalDate dataDiPubblicazione;
    public Genere tipo;
    private DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public String FormattaDati() {
        return String.format("Autore : %s , Titolo: %s, PREZZOPAGINA %.2f, Pagine:%d , tipo: %s, Data: %s ", Autore, Titolo, PREZZOPAGINA * pagine, pagine, tipo, dataDiPubblicazione.format(dataFormat));
    }


}

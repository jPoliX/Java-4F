import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persona {
    public int biglietto;
    public LocalDateTime entrata = LocalDateTime.now();
    public giostre giostreUsate;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        return "Biglietto: " + biglietto + " Orario Entrata: " + entrata.format(formatter);
    }

}

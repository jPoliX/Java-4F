public class Cronometro {

    private Long tempoInizio;
    private Long tempoFine;
    private Long durata;

    public Cronometro() {
        tempoInizio = null;
        tempoFine = null;
        durata = null;
    }

    public void avvia() {
        // Se il cronometro non è già stato avviato
        if (tempoInizio == null) {
            // Ottiene il tempo corrente in millisecondi
            tempoInizio = System.currentTimeMillis();
            System.out.println("Cronometro avviato.");
        } else {
            System.out.println("Il cronometro è già in esecuzione.");
        }
    }

    public void ferma() {
        // Verifica che il cronometro sia stato avviato
        if (tempoInizio != null) {
            // Ottiene il tempo corrente in millisecondi
            tempoFine = System.currentTimeMillis();

            // Calcola la durata
            durata = tempoFine - tempoInizio;

            System.out.println("Cronometro fermato.");
        } else {
            System.out.println("Il cronometro non è stato avviato.");
        }
    }

    public long getDurata() {
        // Se il cronometro è in esecuzione
        if (tempoInizio != null) {
            // Se non è stato fermato, calcola la durata corrente
            if (tempoFine == null) {
                return System.currentTimeMillis() - tempoInizio;
            }
            // Altrimenti restituisce l'ultima durata registrata
            return durata;
        }
        return 0;
    }

    public String getDurataFormattata() {
        long milliseconds = getDurata();

        long ore = milliseconds / 3600000;
        long minuti = (milliseconds % 3600000) / 60000;
        long secondi = (milliseconds % 60000) / 1000;
        long ms = milliseconds % 1000;

        return String.format("%02d:%02d:%02d.%03d", ore, minuti, secondi, ms);
    }
    public void reset() {
        tempoInizio = null;
        tempoFine = null;
        durata = null;
        System.out.println("Cronometro resettato.");
    }
}
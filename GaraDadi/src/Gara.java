import java.util.Scanner;

public class Gara {
    private int nRound;
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private int roundGiocati;
    private Dado dado;

    public Gara(Giocatore giocatore1, Giocatore giocatore2) {
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
    }

    public void setnRound(int nRound) {
        this.nRound = nRound;
    }

    public int getnRound() {
        return nRound;
    }

    public Giocatore getGiocatore1() {
        return giocatore1;
    }

    public Giocatore getGiocatore2() {
        return giocatore2;
    }

    public int getRoundGiocati() {
        return roundGiocati;
    }

    public void iniziaRound() {
        if (fine()) {
            return;
        }
        int valoreG1 = giocatore1.lancia();
        int valoreG2 = giocatore2.lancia();
        roundGiocati++;

        if (valoreG1 > valoreG2) {
            giocatore1.incremento();
        } else if (valoreG2 > valoreG1) {
            giocatore2.incremento();
        } else {
            giocatore1.incremento();
            giocatore2.incremento();
        }
    }


    public boolean fine() {
        if (roundGiocati >= nRound) {
            return true;
        }
        return false;
    }

    public String vincitore() {
        System.out.println("--------------");
        if (giocatore1.getnVittorie() > giocatore2.getnVittorie() && fine()) {
            return ("\nHa vinto " + giocatore1.getNome() + " con " + giocatore1.getnVittorie() + " vittorie");
        } else if (giocatore1.getnVittorie() < giocatore2.getnVittorie() && fine()) {
            return ("\nHa vinto " + giocatore2.getNome() + " con " + giocatore2.getnVittorie() + " vittorie");
        } else
            return ("\nLa partita è finita in pareggio");
    }
}


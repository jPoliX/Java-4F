public class Gara {
    private int nRound;
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private Dado dado;

    public Gara(int nRound, Giocatore giocatore1, Giocatore giocatore2) {
        this.nRound = nRound;
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
    }

    public void iniziaRound() {
        int valoreG1 = giocatore1.getDado().lanciaDado();
        int valoreG2 = giocatore2.getDado().lanciaDado();
        if (valoreG1 > valoreG2) {
            giocatore1.incremento();
        } else if (valoreG2 > valoreG1) {
            giocatore2.incremento();
        } else {
            giocatore1.incremento();
            giocatore2.incremento();
        }
    }
}


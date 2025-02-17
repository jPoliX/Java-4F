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

    public void iniziaRound() {
        if (fine()) {
            System.out.println("Partita finita");
        }
        int valoreG1 = giocatore1.lancia();
        int valoreG2 = giocatore2.lancia();
        roundGiocati++;

        System.out.println("Round " + roundGiocati + "\n");
        System.out.println(giocatore1.getNome() + " ha fatto " + valoreG1);
        System.out.println(giocatore2.getNome() + " ha fatto " + valoreG2);

        if (valoreG1 > valoreG2) {
            giocatore1.incremento();
            System.out.println("Ha vinto " + giocatore1.getNome() + " con valore " + valoreG1 + "\n");
        } else if (valoreG2 > valoreG1) {
            giocatore2.incremento();
            System.out.println("Ha vinto " + giocatore2.getNome() + " con valore " + valoreG2 + "\n");
        } else {
            giocatore1.incremento();
            giocatore2.incremento();
            System.out.println("Round finito in pareggio\n");
        }
    }

    public boolean fine() {
        if (roundGiocati >= nRound) {
            return true;
        }
        return false;
    }

    public void partita() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il numero di round");
        nRound = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nRound; i++) {
            System.out.println("Digita A per iniziare il round");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("A")) {
                iniziaRound();
            }
        }
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


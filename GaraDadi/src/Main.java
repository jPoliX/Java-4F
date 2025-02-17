import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Giocatore g1 = new Giocatore("Marchetto");
        Giocatore g2 = new Giocatore("Messi");
        Gara g = new Gara(g1, g2);
        g.partita();
        System.out.println(g.vincitore());
    }
}
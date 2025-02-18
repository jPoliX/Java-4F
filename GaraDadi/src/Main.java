import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Giocatore g1 = new Giocatore("Marchetto");
        Giocatore g2 = new Giocatore("Messi");
        Gara g = new Gara(g1, g2);
        System.out.println("Inserisci il numero di round");
        g.setnRound(sc.nextInt());
        sc.nextLine();

        for (int i = 0; i < g.getnRound(); i++) {
            System.out.println("\nDigita A per iniziare un round");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("a")) {
                g.iniziaRound();
            }
            System.out.println("\nRound " + g.getRoundGiocati());
            System.out.println("\n" + g1.getNome() + " ha fatto " + g.getGiocatore1().lancia());
            System.out.println(g2.getNome() + " ha fatto " + g.getGiocatore2().lancia() + "\n");
            System.out.println(g1.getNome() + " Vittorie: " + g1.getnVittorie() + "\n");
            System.out.println(g2.getNome() + " Vittorie: " + g2.getnVittorie());
        }
        System.out.println(g.vincitore());
    }
}
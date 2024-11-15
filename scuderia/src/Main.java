import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il nome del pilota");
        String nome = sc.nextLine();
        System.out.println("Inserisci il cognome del pilota");
        String cognome = sc.nextLine();
        System.out.println("Inserisci la nazionalità del pilota");
        String nazionalita = sc.nextLine();
        System.out.println("Inserisci l'età del pilota");
        int eta = Integer.parseInt(sc.nextLine());

        Pilota pilota1 = new Pilota(nome, cognome, nazionalita, eta);

        System.out.println("Inserisci il nome del pilota");
        String nome2 = sc.nextLine();
        System.out.println("Inserisci il cognome del pilota");
        String cognome2 = sc.nextLine();
        System.out.println("Inserisci la nazionalità del pilota");
        String nazionalita2 = sc.nextLine();
        System.out.println("Inserisci l'età del pilota");
        int eta2 = Integer.parseInt(sc.nextLine());

        Pilota pilota2 = new Pilota(nome2, cognome2, nazionalita2, eta2);

        try {
            if (pilota1.equals(pilota2))
                throw new Exception();
        } catch (Exception e) {
            System.out.println("I due piloti sono uguali");
        }
    }
}
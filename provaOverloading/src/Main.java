public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("marchetto");
        System.out.println(studente1.getNome()); //il get è l'interfaccia pubblica
        Studente studente2 = new Studente("marchetto", "messi");
        System.out.println(studente2.getNome() + studente2.getCognome());
    }
}
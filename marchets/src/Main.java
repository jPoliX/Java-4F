public class Main {
    public static void main(String[] args) {

        Dipendente d1 = new Dipendente("Messi", 'M', "Via dei Pini 9");
        Docente d2 = new Docente("Enrico", 'M', "Viale dei Mille", "ITP", "Informatica");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d2.ritornaIndirizzoMaiuscolo());
        Dipendente d3 = new Docente("Lionelo", 'M', "Via delle Capre", "ITP", "Informatica");
        Impiegato d4 = new Impiegato("Federica", 'D', "Via dei Nani", "Trenta");
        System.out.println(d4);
        Istituto s = new Istituto("IIS VIOLA MARCHESINI");
        try {
            s.addDipendente(d1);
         // s.addDipendente(d1); //controlla col metodo (usando l'equals)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Docente d1 = new Docente("Leo", "Pepsi", "Rosario", "Blu", "Barcellona", 37);
        Studente s1 = new Studente("S", "C", "Roma", "Verde", "Juve", 17);
        Studente s2 = new Studente("P", "S", "Torino", "Rosso", "Milan", 18);
        Teatro teatro = new Teatro();

        try {
            teatro.entrataTeatro(d1);
            teatro.entrataTeatro(s1);
            teatro.entrataTeatro(s2);
            teatro.stampa();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
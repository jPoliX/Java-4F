public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Nello", "Taver", "Rosario", "Blu", "Giuventus", 17);
        Studente s = new Studente("Lionelo", "Pepsi", "America", "Bianco", "Pomodori", 46);
        System.out.println(s.getSquadraDelCuore());
        System.out.println(s.presentazione());
    }
}
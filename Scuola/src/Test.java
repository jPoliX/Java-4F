public class Test {
    public static void main(String[] args) {
        Scuola elem = new Elementari("E001", "Scuola Primaria Alfa", "Via Roma, 1", "Milano", 200, 2);
        Scuola media = new Medie("M001", "Scuola Media Beta", "Via Milano, 10", "Torino", 300, 5, 1);
        Scuola liceo = new Liceo("S001", "Liceo Classico Gamma", "Via Torino, 20", "Roma", 500, 20, 8);
        Scuola tecnico = new Tecnico("S002", "Istituto Tecnico Delta", "Via Napoli, 5", "Napoli", 400, 15, 10);
        Scuola professionale = new Professionale("S003", "Istituto Professionale Epsilon", "Via Firenze, 8", "Firenze", 350, 12, 7);

        System.out.println(elem);
        System.out.println(media);
        System.out.println(liceo);
        System.out.println(tecnico);
        System.out.println(professionale);
    }
}
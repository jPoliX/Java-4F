/* Si intende realizzare una gerarchia di classi per rappresentare e gestire i seguenti tipi di oggetti: PC fissi, suddivisi in desktop e server, e PC portatili di tipo notebook.
Le caratteristiche generali di interesse sono: il tipo di processore, la dimensione della memoria RAM, la dimensione della memoria di massa, la marca, il modello e il sistema operativo.
I PC fissi sono caratterizzati dal tipo di contenitore (grande, medio, piccolo),
per quelli desktop è necessario registrare il tipo di scheda video,
mentre per i PC fissi di tipo server è necessario sapere il numero dei processori e se hanno o meno dischi di tipo RAID.
I PC portatili sono caratterizzati dal peso, dalle dimensioni fisiche (altezza, larghezza e profondità) e dalle dimensioni del video.
1-Definire mediante un diagramma UML le classi che realizzano la gerarchia descritta.
2-Implementare in linguaggio Java le classi progettate specificando costruttori e metodi di accesso agli attributi e sovrascrivendo opportunamente i metodi toString ed equals.
Codificare una classe Test il cui metodo main istanzi oggetti corrispondenti alle varie tipologie di PC e invochi ciascuno dei metodi definiti almeno una volta.
Sempre nella stessa classe Test verificare i meccanismi di up-casting e down-casting.
*/

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer("P", 16, 500, "M", "Modello", "Windows");
        System.out.println(c);

        Fissi f = new Fissi("P", 16, 500, "M", "Modello", "Windows", Contenitore.GRANDE, "Scheda", Tipo.FISSO);
        System.out.println(f);

        Portatili p = new Portatili("P", 16, 1000, "Marca", "Modello", "Linux", 10, 17, 2, 3, 1, Tipo.PORTATILE);
        System.out.println(p);

        Server s = new Server("P", 16, 1000, "Marca", "Modello", "Linux", 1, false, Tipo.SERVER);
        System.out.println(s);

        //Up casting
        Computer comp1 = new Fissi("Intel", 16, 500, "Dell", "XPS", "Windows", Contenitore.MEDIO, "NVIDIA", Tipo.FISSO);
        System.out.println(comp1);

        //Down casting
        if (comp1 instanceof Fissi) {
            Fissi fisso = (Fissi) comp1;
        }
    }
}
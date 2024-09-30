import static utility.Tools.*;
/*
Generare un valore contenente numeri casuali
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Menu", "1- Genera Random", "2- Visualizzazione", "3-Ricerca","4-Elimina","5-Elimina Nuovo","6- Fine"};
        boolean esci = true;
        int MAXNUMERI = 50;
        int[] nEstratti2 = new int[MAXNUMERI];
        int[]nuovo=new int[MAXNUMERI*2];
        int nElementi=0;
        int numero=0;
        do {
            switch (Menu(opzioni, tastiera)) {
                case 1:
                    System.out.println("Generazione");
                    generaNumeri2(nEstratti2);
                    break;
                case 2:
                    System.out.println("Visualizzazione");
                    Visualizza(nEstratti2);
                    break;
                case 3:
                    System.out.println("inserisci un numero: ");
                    numero=(Integer.parseInt(tastiera.nextLine()));
                    int posizione=presente(nEstratti2,numero);
                    if(posizione==-1){
                        System.out.println("non presente");
                    } else
                        System.out.printf("Posizione: %d\n", posizione+1);
                /*case 4:
                    System.out.println("inserisci numero da cancellare");
                    int posizione1=rimuoviNumero(nEstratti2, Integer.parseInt(tastiera.nextLine()));
                    if(posizione1 !=-1){
                        System.out.println("numero cancellato in posizione" + posizione1);
                    }else System.out.println("numero non trovato");
                    break;*/
                case 4:
                    raddoppiaVettore(nEstratti2,MAXNUMERI,nuovo);
                    Visualizza(nuovo);
                    break;
                case 5:
                    System.out.println("Inserisci il numero da eliminare: ");
                    numero = Integer.parseInt(tastiera.nextLine());
                    posizione = presente(nEstratti2, numero);
                    if (posizione == -1) {
                        System.out.println("Numero non presente, impossibile eliminare.");
                    } else {
                        nEstratti2 = rimuoviNumero2(nEstratti2, MAXNUMERI, posizione);
                        System.out.println("Numero eliminato correttamente.");
                    }
                    break;
                case 6:
                    System.out.println("Fine");
                    esci = false;
                    break;
            }
        } while (esci);
    }

    public static void generaNumeri2(int[] vettore) {
        Random numeroRandom = new Random();
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = numeroRandom.nextInt(0, 49) + 1;
        }
    }
    public static void Visualizza(int[] nEstratti2){
        int cont=0;
        for(int i: nEstratti2){
            System.out.printf("%3d", i);
            cont++;
            if(cont==10){
                cont=0;
                System.out.println();
            }
        }
    }
    public static int presente(int[]vettore, int numero){
        int posizione=-1;
        for(int i=0;i< vettore.length;i++){
            if(numero==vettore[i]){
                posizione=i;
            }
        }
        return posizione;
    }
    public static int rimuoviNumero(int[] vettore, int numero) {
      int numeroTovato=presente(vettore, numero);
          if(numero!=-1){
              for(int i=0;i<vettore.length;i++){
                  vettore[i]=vettore[i+1];
              }
              vettore[vettore.length-1]=0;
          }
        return numeroTovato;
    }
    public static int[] rimuoviNumero2(int[] vettore, int MAXNUMERI, int posizione) {
        for (int i = posizione; i < MAXNUMERI - 1; i++) {
            vettore[i] = vettore[i + 1];
        }
        MAXNUMERI--;
        generaNumeri2(vettore);
        return vettore;
    }
    public static int[] raddoppiaVettore(int[]vettore, int MAXNUMERI, int[]nuovo){
        Random numeroRandom = new Random();
        for(int i=0;i<vettore.length;i++){
            vettore[i]=nuovo[i];
            for(int j=MAXNUMERI;i<nuovo.length;i++) {
                nuovo[i] = numeroRandom.nextInt(0, 99) + 1;
            }
        }
        return nuovo;
    }
}

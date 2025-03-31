import java.util.ArrayList;

/**
 * @author Alessio Poli
 * @version
 */
class NegozioElettronica {
    private ArrayList<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
        System.out.println("Prodotto aggiunto!");
    }

    public Prodotto cercaProdotto(String codiceProdotto) {
        for (Prodotto p : prodotti) {
            if (prodotti.contains(codiceProdotto)) {
                return p;
            }
        }
        return null;
    }


    public void rimuoviProdotto(String nome) {
        Prodotto daRimuovere = cercaProdotto(nome);
        if (prodotti.contains(daRimuovere)) {
            prodotti.remove(daRimuovere);
            System.out.println("Prodotto rimosso!");
        } else {
            System.out.println("Prodotto non trovato.");
        }
    }


    public void visualizzaProdotti() {
        if (prodotti.isEmpty()) {
            System.out.println("Nessun prodotto disponibile.");
        } else {
            for (Prodotto p : prodotti) {
                System.out.println(p);
            }
        }
    }
}

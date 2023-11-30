package passante.prodotti;

public class Market {
    private int max;
    private Prodotto[] prodotti;

    public Market(int max) {
        this.max = max;
        this.prodotti = new Prodotto[max];
    }

    public void addProducts(Prodotto p) {
        for (var i = 0; i < prodotti.length; i++) {
            if (prodotti[i] == null) {
                prodotti[i] = p;
                break;
            }
        }
    }

    public void printProducts() {
        for (Prodotto p : prodotti) {
            p.printDetails();
            System.out.println("************");
        }
    }
}

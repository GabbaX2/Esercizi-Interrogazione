package passante.prodotti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);

        int maxProducts = 0;

        try {
            System.out.println("how many Products?? >> ");
            maxProducts = ipt.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("invalid input");
            System.exit(1);
        }

        Market MashaEOrso = new Market(maxProducts);

        MashaEOrso.addProducts(new Prodotto(ipt));


    }
}

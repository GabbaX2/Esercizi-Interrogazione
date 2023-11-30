package passante.prodotti;

import java.util.Scanner;

public class Prodotto {
    private String name;
    private double price;
    private int amount;

    public Prodotto(Scanner ipt) {
        ipt.nextLine();

        System.out.println("name >> ");
        this.name = ipt.nextLine();

        System.out.println("price >> ");
        this.price = ipt.nextDouble();

        System.out.println("amount >> ");
        this.amount = ipt.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int totalAmount() {
        return (int) (price * amount);
    }

    public void printDetails() {
        System.out.println("name >> " + name + "\nprice >> " + price + "\namount >> " + amount + "\nTOTAL AMOUNT >> " + totalAmount());
    }
}

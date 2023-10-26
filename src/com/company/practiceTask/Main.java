package com.company.practiceTask;

public class Main {

    public static void main(String[] args) {

        Card card = new Card("Datka", "M", 123456789, 4000, "Datka2312");
        Basket basket = new Basket(new Product[] {new Product("Bread", 50), new Product("Milk", 10)});
        Client client = new Client("Datka", "M", 12, card, basket);
        int balance = 0;
        for (int i = 0; i < client.getBasket().getProducts().length; i++) {
            balance += client.getBasket().getProducts()[i].getPrice();
        }

        client.payWithCard(balance);
    }
}

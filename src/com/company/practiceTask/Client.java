package com.company.practiceTask;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Client implements CardInterface {

    private String firstName;
    private String lastName;
    private int age;
    private Card card;
    private Basket basket;

    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    @Override
    public void payWithCard(double amountOfMoney) {
        if (amountOfMoney >= 100) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter password!");
            String password = scanner.nextLine();
            if (password.equals(card.getPassword())) {
                double balance = card.getBalance();
                double rest = balance - amountOfMoney;
                if (rest <= 0) {
                    System.out.println("Insufficient funds to pay!");
                } else {
                    System.out.println("    ~You check!~\n");
                    for (Product p : basket.getProducts()) {
                        System.out.println("product: " + p.getProductName() + ",\n" +
                                "price:   " + p.getPrice() + "\n");
                    }
                    System.out.println("~~~~~~~ Thank you ~~~~~~~");
                }
            } else {
                System.out.println("Password is wrong!");
            }
        } else {
            double balance = card.getBalance();
            double rest = balance - amountOfMoney;
            if (rest <= 0) {
                System.out.println("Insufficient funds to pay!");
            } else {
                int sum = 0;
                System.out.println("    ~You check!~\n");
                System.out.println("Product:               Price:");
                for (Product p : basket.getProducts()) {
                    System.out.print(p.getProductName());
                    System.out.println("                   " + p.getPrice() + " $\n");
                    sum += p.getPrice();
                }
                System.out.println("TOTAL AMOUNT:          " + sum + " $");
                System.out.println("~~~~~~~ Thank you ~~~~~~~");
            }
        }
    }

    @Override
    public double getCardBalance() {
        return card.getBalance();
    }
}


//    public void payWithCard2(double amountOfMoney) {
//        if (amountOfMoney >= 100) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter password!");
//            String password = scanner.nextLine();
//            if (password.equals(card.getPassword())) {
//                double balance = card.getBalance();
//                double rest = balance - amountOfMoney;
//                if (rest <= 0) {
//                    System.out.println("Insufficient funds to pay!");
//                } else {
//                    System.out.println("    ~You check!~\n");
//                    for (Product p : basket.getProducts()) {
//                        System.out.println("product: " + p.getProductName() + ",\n" +
//                                "price:   " + p.getPrice() + "\n");
//                    }
//                    System.out.println("~~~~~~~ Thank you ~~~~~~~");
//                }
//            } else {
//                System.out.println("Password is wrong!");
//            }
//        } else {
//            double balance = card.getBalance();
//            double rest = balance - amountOfMoney;
//            if (rest <= 0) {
//                System.out.println("Insufficient funds to pay!");
//            } else {
//                int sum = 0;
//                System.out.println("    ~You check!~\n");
//                System.out.println("Product:               Price:");
//                for (Product p : basket.getProducts()) {
//                    System.out.print(p.getProductName());
//                    System.out.println("                   " + p.getPrice() + " $\n");
//                    sum += p.getPrice();
//                }
//                System.out.println("TOTAL AMOUNT:          " + sum + " $");
//                System.out.println("~~~~~~~ Thank you ~~~~~~~");
//            }
//        }
//    }
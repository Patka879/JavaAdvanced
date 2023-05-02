package org.example.advanced.postoffice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Post {
    private Parcel parcel;
    private double takings;

    public Post(Parcel parcel) {
        this.parcel = parcel;
        this.takings = 0;
    }

    public void sendPackage(Parcel parcel) {
        Scanner scanner = new Scanner(System.in);
        double price = parcel.parcelPrice();
        System.out.println("Please enter amount paid by You: ");
        Double moneyPaid = scanner.nextDouble();
        System.out.println();
        double moneyToReturn = 0;
        if (moneyPaid >= price) {
            parcel.setStatus(Status.SHIPPED);
            moneyToReturn = moneyPaid - price;
            System.out.println("Your package has been sent");
        } else {
            moneyToReturn = moneyPaid;
            parcel.setStatus(Status.REJECTED);
            System.out.println("Not enough money, You can't send this package.");
        }
        takings = moneyPaid - moneyToReturn;
        String formattedPrice = String.format("%.2f", moneyToReturn);
        System.out.println("Money returned to customer: " + formattedPrice);
    }

    public void createAndReturn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sender name:");
        String sender = scanner.nextLine();
        System.out.println("Enter recipient name:");
        String recipient = scanner.nextLine();
        System.out.println("Parcel weight (grams):");
        int weight = scanner.nextInt();
        System.out.println("Is it a priority (true/false)?");
        boolean isPrioritized = scanner.nextBoolean();

        Parcel parcel = new Parcel(sender, recipient, weight, isPrioritized);
        sendPackage(parcel);
        System.out.println(parcel);

    }
}

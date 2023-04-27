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

    public void sendPackage(Parcel parcel, double moneyPaid) {
        double price = parcel.parcelPrice();
        double moneyToReturn = 0;
        if (moneyPaid >= price) {
            parcel.setStatus(Status.SHIPPED);
            moneyToReturn = price - moneyPaid;
        } else {
            moneyToReturn = moneyPaid;
        }
        takings = moneyPaid - moneyToReturn;
        System.out.println("Money returned to customer: " + moneyToReturn);
    }

    public String createAndReturn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pay for the package (##.##)");
        double moneyPaid = scanner.nextDouble();
        System.out.println("Add below information:");
        System.out.println("Sender name:");
        String sender = scanner.nextLine();
        System.out.println("Recipient name:");
        String recipient = scanner.nextLine();
        System.out.println("Parcel weight (grams):");
        int weight = scanner.nextInt();
        System.out.println("Is it a priority (true/false)?");
        boolean isPrioritized = scanner.nextBoolean();

        Parcel parcel = new Parcel(sender, recipient, weight, isPrioritized);
        sendPackage(parcel, moneyPaid);

        return "Parcel details: " + "\n" +
                parcel +
                "Parcel price:" + "\n" +
                parcel.parcelPrice() + "\n";

    }
}

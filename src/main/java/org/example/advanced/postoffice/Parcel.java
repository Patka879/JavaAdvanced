package org.example.advanced.postoffice;

import java.sql.SQLOutput;

public class Parcel {
    private String sender;
    private String recipient;
    private int weight;
    private boolean isPrioritizes;

    public Parcel(String sender, String recipient, int weight) {
        if(sender == null || sender.isEmpty()) {
            System.out.println("Error: Sender is not specified");
        }
        if(recipient == null || recipient.isEmpty()) {
            System.out.println("Error: Recipient is not specified");
        }
        if(weight < 1)  {
            System.out.println("Error: Package is too light");
        } else if (weight > 10000) {
            System.out.println("Error: Package is too heavy");
        }
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public Parcel(String sender, String recipient, int weight, boolean isPrioritizes) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.isPrioritizes = isPrioritizes;
    }

    public double parcelPrice() {
        double price = 0;

        if (weight < 500) {
            price = 5;
        } else if (weight > 500 && weight < 1000) {
            price = 10;
        } else if (weight > 1000 && weight < 2000) {
            price = 12;
        } else if (weight > 2000) {
            price = 12 + (weight -  2000) * 0.01;
        }

        if (isPrioritizes) {
            price += 0.1 * price;
        }

        System.out.println("Parcel price is " + price + " PLN");
        return price;
    }

    @Override
    public String toString() {
        return "Parcel info: " + "\n" +
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient + "\n" +
                "Weight: " + weight + "grams" + "\n" +
                "Priority: " + (isPrioritizes ? "Yes" : "No");
    }
}

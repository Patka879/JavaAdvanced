package org.example.advanced.postoffice;

public class Parcel {
    private String sender;
    private String recipient;
    private int weight;
    private boolean isPrioritized;

    private Status status;

    public Parcel(String sender, String recipient, int weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.status = Status.CREATED;
        validateData();
    }

    public Parcel(String sender, String recipient, int weight, boolean isPrioritizes) {;
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.isPrioritized = isPrioritizes;
        this.status = Status.CREATED;
        validateData();
    }

    public void setStatus(Status status) {
        this.status = status;
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

        if (isPrioritized) {
            price += 0.1 * price;
        }

        String formattedPrice = String.format("%.2f", price);
        System.out.println("Parcel price is " + formattedPrice + " PLN");
        return price;
    }


    private void validateData() {
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
    }

    @Override
    public String toString() {
        return "Parcel info: " + "\n" +
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient + "\n" +
                "Weight: " + weight + "grams" + "\n" +
                "Priority: " + (isPrioritized ? "Yes" : "No");
    }
}

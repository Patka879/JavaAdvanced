package org.example.advanced.postoffice;

import java.sql.SQLOutput;
import java.util.Random;

public class PackageDemo {
    public static void main(String[] args) {
        final Parcel parcel1 = new Parcel("Kuba", "Kamila", 2300, true);
        final Parcel parcel2 = new Parcel("Mateusz", "Kuba", 1212);
        final Parcel parcel3 = parcel1;

        //Checking price
        parcel1.parcelPrice();
        parcel2.parcelPrice();
        parcel3.parcelPrice();

        Parcel[] parcels = {parcel1, parcel2, parcel3};
        //Price of the first package from the array:
        parcels[0].parcelPrice();

        // Creating an Array of 100 parcels:
        Parcel[] oneHundredParcels = new Parcel[100];
        Random random = new Random();
        for (int i = 0; i < oneHundredParcels.length; i++) {
            String sender = "Sender" + (i + 1);
            String recipient = "Recipient" + (i + 1);
            int weight = 100 + (i * 5);
            boolean isPriority = random.nextBoolean();
            Parcel singleParcel = new Parcel(sender, recipient, weight, isPriority);
            oneHundredParcels[i] = singleParcel;
        }

        // Displaying Array Data
        double totalPrice = 0;
        for (Parcel parcel : oneHundredParcels) {
            System.out.println(parcel);
            totalPrice += parcel.parcelPrice();
        }
        System.out.println("Total price of 100 parcels is " + totalPrice + " PLN");
    }
}

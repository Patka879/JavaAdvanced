package org.example.advanced.postoffice;

public class PostOfficeDemo {
    public static void main(String[] args) {
        final Parcel parcel1 = new Parcel("", "Kamila", 2300, true);
        final Parcel parcel2 = new Parcel("Mateusz", "", 1212);
        final Parcel parcel3 = new Parcel("Jakub", "Kamila", 2300, true);

        //Checking price
        parcel1.parcelPrice();
        parcel2.parcelPrice();
        parcel3.parcelPrice();

        Parcel[] parcels = {parcel1, parcel2, parcel3};
        //Price of the first package from the array:
        parcels[0].parcelPrice();

        // Creating an Array of 100 parcels:
//        Package[] oneHundredParcels = new Package[100];
//        Random random = new Random();
//        for (int i = 0; i < oneHundredParcels.length; i++) {
//            String sender = "Sender" + (i + 1);
//            String recipient = "Recipient" + (i + 1);
//            int weight = 100 + (i * 5);
//            boolean isPriority = random.nextBoolean();
//            Package singleParcel = new Package(sender, recipient, weight, isPriority);
//            oneHundredParcels[i] = singleParcel;
//        }
//
//        // Displaying Array Data
//        double totalPrice = 0;
//        for (Package parcel : oneHundredParcels) {
//            System.out.println(parcel);
//            totalPrice += parcel.parcelPrice();
//        }
//        System.out.println("Total price of 100 parcels is " + totalPrice + " PLN");
    }
}

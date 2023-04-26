package org.example.advanced.postoffice;

public class PackageDemo {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel("Jon Doe","Jane Doe", 222, true);

        // Printing Errors:
        Parcel parcel2 = new Parcel("", "Smiths", 199); // will print an error
        Parcel parcel3 = new Parcel("Johns", "Grimm", 2100); // will print an error

        Parcel[] parcels = {parcel1, parcel2, parcel3};

        System.out.println("=======================");
        for(Parcel parcel : parcels) {
            System.out.println(parcel + "\n \n");
        }

        System.out.println("=======================");
        System.out.println("Prices");
        parcel1.parcelPrice();
        parcel2.parcelPrice();
        parcel3.parcelPrice();
    }
}

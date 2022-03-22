package com.bridgelabz;

import java.util.Scanner;

public class AddressBook implements NewContact {
    Scanner scanner = new Scanner(System.in);

    //UC2- Add New Contact to Address Book
    @Override
    public void add() {
        Contact contact = new Contact();

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter your Address:");
        String address = scanner.nextLine();
        System.out.println("Enter your City:");
        String city = scanner.nextLine();
        System.out.println("Enter your State:");
        String state = scanner.nextLine();
        System.out.println("Enter Zip code:");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Phone Number:");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter your Email:");
        String email = scanner.nextLine();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);

        System.out.println("############## CONTACT DETAILS #############");

        System.out.println("First Name: " + contact.getFirstName());
        System.out.println("Last Name: " + contact.getLastName());
        System.out.println("Address: " + contact.getAddress());
        System.out.println("City: " + contact.getCity());
        System.out.println("State: " + contact.getState());
        System.out.println("Zip Code: " + contact.getZipCode());
        System.out.println("Phone Number: " + contact.getPhoneNumber());
        System.out.println("e-Mail: " + contact.getEmail());
    }
}

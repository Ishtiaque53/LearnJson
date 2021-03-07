package com.LearningJSON;

import java.util.Scanner;

public class Student {
    private String fullName;
    private String userName;
    private String password;
    private String phone;
    private String email;

    Address address = new Address();
    Details details = new Details();
    Experience experience = new Experience();

    public void setAddress(String street, String city, String area, String country) {

        address.street = street;
        address.city = city;
        address.area = area;
        address.country = country;
    }
    public Address getAddress() {
        return address;
    }

    public void setDetails(String favouriteColour, String favouriteGame, String favouriteFood, String favouriteMovie) {

        details.favouriteColour = favouriteColour;
        details.favouriteGame = favouriteGame;
        details.favouriteFood = favouriteFood;
        details.favouriteMovie = favouriteMovie;
    }
    public Details getDetails() {
        return details;
    }

    public void setExperience(String service, String study) {

        experience.service = service;
        experience.study = study;
    }
    public Experience getExperience() {
        return experience;
    }

    /*public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full Name: ");
        fullName = scanner.nextLine();

        System.out.print("Username: ");
        userName = scanner.next();

        System.out.print("Password: ");
        password = scanner.next();

        System.out.print("Phone: ");
        phone = scanner.next();

        System.out.print("Email: ");
        email = scanner.next();

        System.out.println("Full Name: " + fullName);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);

        setAddress("khulshi","chittagong","chittagong","bangladesh");
    }*/

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
}

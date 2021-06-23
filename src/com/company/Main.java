package com.company;

import java.util.Scanner;


public class Main {
    public static final String PATTERN_PHONE = "(\\+)\\d{12}";
    public static final String PATTERN_NAME = "^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$";
    public static final String PATTERN_EMAIL = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])";


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name and last name: ");
        String name = in.nextLine();

        boolean isValidName = name.matches(PATTERN_NAME);
        if (isValidName) {
            System.out.println("Name validation successful");
            } else {
                System.out.println("Illegal. Name must contains only A-Z, a-z and space");
                System.exit(0);
            }

        System.out.print("Enter phone number: ");
        String number = in.nextLine();

        boolean isValidPhone = number.matches(PATTERN_PHONE);
        if (isValidPhone) {
            System.out.println("Phone number validation successful");
            } else {
                System.out.println("Illegal. Phone number must contains only numbers and +");
                System.exit(0);
            }

        System.out.print("Enter email: ");
        String mail = in.nextLine();

        boolean isValidEmail = mail.matches(PATTERN_EMAIL);
        if (isValidEmail) {
            System.out.println("Email validation successful");
            } else {
                System.out.println("Illegal. Email address must be in a format: (A-Z,0-9,_.+-)@(A-Z0-9.-).[A-Z]");
                System.exit(0);
            }
        }

    }

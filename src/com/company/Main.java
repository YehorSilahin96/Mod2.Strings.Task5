package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // according to best practices which make code neat and clean, new variable must be created as much close to the code using it as it's possible
        System.out.print("Enter name and last name: ");
        String name = in.nextLine();
        System.out.print("Enter phone number: ");
        String num = in.nextLine();
        System.out.print("Enter email: ");
        String mail = in.nextLine();

        boolean res1 = name.matches("^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$"); // Always put strings like this to constants. Do you know why? 
        if (res1) {
            System.out.println("Name validation successful");
        }
            else { // please, fix formatting. 'else' must be on the same line with '}' 
            System.out.println("Illegal. Name must contains only A-Z, a-z and space");
            } // please, fix indentation

        boolean res2 = num.matches("(\\+)\\d{12}"); // Always put this 'magic numbers' to constants
        if (res2) {
            System.out.println("Phone number validation successful");
            }
            else {
                System.out.println("Illegal. Phone number must contains only numbers and +");
            }

        boolean res3 = mail.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
        if (res3) {
            System.out.println("Email validation successful");
        }
            else {
            System.out.println("Illegal. Email address must be in a format: (A-Z,0-9,_.+-)@(A-Z0-9.-).[A-Z]");
            }
        }

    }

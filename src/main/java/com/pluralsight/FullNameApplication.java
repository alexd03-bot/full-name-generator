package com.pluralsight;

import java.util.regex.Pattern;
import java.util.*;
import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("first name: ");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();

        System.out.println("middle name: ");
        String middleName = scanner.nextLine();
        middleName = middleName.trim();

        System.out.println("last name: ");
        String lastName = scanner.nextLine();
        lastName = lastName.trim();

        System.out.println("suffix: ");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();


        String name = firstName + middleName + lastName + ", " + suffix;

        String[] output = name.split("\\|");

        System.out.println(output);


    } //psvm end




}

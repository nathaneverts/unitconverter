package Nathan;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        double feet;
        double meter;
        double pounds;
        double kilograms;
        double fahrenheit;
        double celsius;
        char option = '\0';
        Scanner input = new Scanner(System.in);
        do {

            List<String> choices = Arrays.asList("convert from feet to meters", "convert from pounds to kgs", "convert from fahrenheit to celsius");

            for (int i = 0; i < choices.size(); i++) {
                System.out.println(i + " : " + choices.get(i));
            }
            Scanner reader = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("Enter your conversion choice: ");


//            int n = reader.nextInt();
            option = reader.next().charAt(0);



            switch (option) {
                case '0':
                    System.out.println("Enter a value to convert feet to meters");

                    feet = input.nextDouble();

                    meter = feet * 0.30;
                    System.out.println("\n");
                    System.out.println(feet + " is " + meter + " meters");

                    break;

                case '1':

                    System.out.println("Enter a value to convert pounds to kgs");
                    pounds = input.nextDouble();

                    kilograms = pounds * 0.454;
                    System.out.println("\n");
                    System.out.println(pounds + " is " + kilograms + " kilograms");

                    break;

                case '2':

                    System.out.println("Enter a value to convert fahrenheit to celsius ");
                    fahrenheit = input.nextDouble();

                    celsius = (fahrenheit - 32) / 1.8;
                    System.out.println("\n");
                    System.out.println(fahrenheit + " is " + celsius + " celsius");

                    break;

                default:
                    System.out.println("========");
                    break;

            }
        } while (option != 4) ;
            System.out.println("bye");

    }
}

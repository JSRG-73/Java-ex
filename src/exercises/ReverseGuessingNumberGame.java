package exercises;

import java.util.Scanner;

public class ReverseGuessingNumberGame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opc;
        int lowest = 1;  
        int highest = 100; 
        int counter = 0;

        System.out.println("Hi there! Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Press 1 when you are ready.\n");

        while (true) {
            int randomNum = lowest + (int) (Math.random() * (highest - lowest + 1));
            System.out.println("Is your number " + randomNum + "?");
            System.out.println("Press 1 if that's your number");
            System.out.println("Press 2 if your number is higher");
            System.out.println("Press 3 if your number is lower");
            System.out.print("\nType your answer: ");

            opc = in.nextInt();
            counter++;

            switch (opc) {
                case 1: {
                    System.out.println("Great! Your number was " + randomNum + ". I only needed " + counter + " attempts!");
                    break; 
                }
                case 2: {
                    System.out.println("Ok, your number is higher than " + randomNum);
                    lowest = randomNum + 1; 
                    break;
                }
                case 3: {
                    System.out.println("Ok, your number is lower than " + randomNum);
                    highest = randomNum - 1; 
                    break;
                }
                default: {
                    System.out.println("Invalid input. Please press 1, 2, or 3.");
                    continue;
                }
            }

            if(opc==1)break;
            if (lowest > highest) {
                System.out.println("Error: The range is invalid. Did you make a mistake?");
                break;
            }
        }

        in.close();
    }
}


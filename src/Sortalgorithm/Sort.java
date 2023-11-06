package Sortalgorithm;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] userArray = new int[size];

        // Prompt the user to enter values 
        System.out.println("Enter " + size + " values for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        // Display the values of the array
        System.out.println("Values in the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Value " + (i + 1) + ": " + userArray[i]);
        }

        // Selection Sort
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (userArray[j] < userArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = userArray[minIndex];
            userArray[minIndex] = userArray[i];
            userArray[i] = temp;
        }

        // Display the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(userArray[i] + " ");
        }
        System.out.println();

        // Ask the user for the position to add a new element, ensuring it's within the range of the array
        int newPosition;
        do {
            System.out.print("Enter a position to add a new element (1 to " + (size + 1) + "): ");
            newPosition = scanner.nextInt();
            if (newPosition < 1 || newPosition > size + 1) {
                System.out.println("Incorrect position. Please enter a position within the range of the array.");
            }
        } while (newPosition < 1 || newPosition > size + 1);

        // Ask the user to enter the new element
        System.out.print("Enter the new element: ");
        int newElement = scanner.nextInt();

        // Create a new array with the new element
        int[] newArray = new int[size + 1];
        for (int i = 0, j = 0; i < size + 1; i++) {
            if (i == newPosition - 1) {
                newArray[i] = newElement;
            } else {
                newArray[i] = userArray[j];
                j++;
            }
        }

        //final array
        System.out.print("Final array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        // Close scanner
        scanner.close();
    }
}


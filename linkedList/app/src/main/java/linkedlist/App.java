/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        int choice = 0;
        do {
            System.out.println("Hello to Linked List program");
            System.out.println("1- Insert");
            System.out.println("2- Include");
            System.out.println("3- Print");
            System.out.println("4- Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    linkedList.insert(value);
                    break;

                case 2:
                    System.out.print("Enter value to check: ");
                    int checkValue = scanner.nextInt();
                    boolean includes = linkedList.includes(checkValue);
                    if (includes) {
                        System.out.println("Value " + checkValue + " exists");
                    } else {
                        System.out.println("Value " + checkValue + " does not exists");
                    }
                    break;
                case 3:
                    System.out.println("Linked List: " + linkedList);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

}
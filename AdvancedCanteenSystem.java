package com.codegnan.controlstatements;
import java.util.Scanner;

public class AdvancedCanteenSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTea = 0, totalcoffee = 0, totalSamosa = 0;
        int teaPrice = 10, coffeePrice = 15, samosaPrice = 20;
        double taxRate = 0.05;

        int choice;

        do {
            System.out.println("||=========== CANTEEN MENU ===========||");
            System.out.println("1. View Menu");
            System.out.println("2. Order Items");
            System.out.println("3. View Bill");
            System.out.println("4. Checkout and Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- MENU ---");
                    System.out.println("1. Tea     - ₹" + teaPrice);
                    System.out.println("2. Coffee  - ₹" + coffeePrice);
                    System.out.println("3. Samosa  - ₹" + samosaPrice);
                    break;

                case 2:
                    System.out.print("Enter item number to order (1-3): ");
                    int item = sc.nextInt();

                    if (item < 1 || item > 3) {
                        System.out.println("Invalid item number! Please select 1-3.");
                        break;
                    }

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    if (qty <= 0) {
                        System.out.println("Please enter a value greater than 0.");
                        break;
                    }

                    switch (item) {
                        case 1:
                            totalTea += qty;
                            System.out.println(qty + " Tea(s) added.");
                            break;
                        case 2:
                            totalcoffee += qty;
                            System.out.println(qty + " Coffee(s) added.");
                            break;
                        case 3:
                            totalSamosa += qty;
                            System.out.println(qty + " Samosa(s) added.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("--- BILL ---");
                    double subtotal = 0;

                    if (totalTea > 0) {
                        System.out.println("Tea x" + totalTea + " = ₹" + (totalTea * teaPrice));
                        subtotal += totalTea * teaPrice;
                    }
                    if (totalcoffee > 0) {
                        System.out.println("Coffee x" + totalcoffee + " = ₹" + (totalcoffee * coffeePrice));
                        subtotal += totalcoffee * coffeePrice;
                    }
                    if (totalSamosa > 0) {
                        System.out.println("Samosa x" + totalSamosa + " = ₹" + (totalSamosa * samosaPrice));
                        subtotal += totalSamosa * samosaPrice;
                    }

                    if (subtotal == 0) {
                        System.out.println("No items ordered yet!");
                        break;
                    }

                    double tax = subtotal * taxRate;
                    double total = subtotal + tax;

                    System.out.println("Subtotal = ₹" + subtotal);
                    System.out.println("Tax (5%) = ₹" + tax);
                    System.out.println("Total = ₹" + total);
                    break;

                case 4:
                    System.out.println("Thank you! Exiting system");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}

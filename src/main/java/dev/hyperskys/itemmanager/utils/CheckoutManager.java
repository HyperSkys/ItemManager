package dev.hyperskys.itemmanager.utils;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckoutManager {

    public static final DecimalFormat DF = new DecimalFormat(".##");

    public static void finialCheckout(double totalCost) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Coupons?: ");
            boolean coupons = scanner.nextBoolean();

            if(coupons) {
                System.out.println("Coupon Code?: ");
                int couponCode = scanner.nextInt();

                if(couponCode == 1234) {
                    totalCost -= 0.99;
                    System.out.println("You saved $0.99 by using your coupon!");
                } else {
                    System.out.println("Invalid Coupon Code!");
                }

                System.out.println("Amount Inserted?: ");
                double amountInserted = scanner.nextDouble();

                double changeToGive = amountInserted-totalCost;
                System.out.println("Change: $"+ DF.format(changeToGive));
            }

        } catch(InputMismatchException ex) {
            System.out.println("Sorry, you have entered an invalid input.");
        }
    }
}

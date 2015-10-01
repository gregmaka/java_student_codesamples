//Greg Maka

import java.util.Scanner;

public class CreateBabysittingJob {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year.");
        int year = input.nextInt();
        while (year < 2013 || year > 2025) {
            System.out.println("Enter a year between 2013 and 2025");
            year = input.nextInt();
        }
        System.out.print("Enter job number");
        int jobNumber = input.nextInt();
        while (jobNumber < 1 || jobNumber > 9999) {
            System.out.println("Enter a number between 1 and 9999");
            jobNumber = input.nextInt();
        }
        System.out.print("Enter babysitter code");
        int babysitterCode = input.nextInt();
        while (babysitterCode < 1 || babysitterCode > 3) {
            System.out.println("Enter a number between 1 and 3");
            babysitterCode = input.nextInt();
        }
        System.out.print("Enter number of children");
        int childrenNumber = input.nextInt();
        while (childrenNumber < 1 || childrenNumber > 9) {
            System.out.println("Enter a number between 1 and 9");
            childrenNumber = input.nextInt();
        }
        System.out.print("Will diaper changing be required?");
        int diaper = input.nextInt();
        while (diaper < 1 || diaper > 2) {
            System.out.println("Enter 1 for yes and 2 for no. ");
            diaper = input.nextInt();
        }
        System.out.print("Enter number of hours");
        int hoursWorked = input.nextInt();
        while (hoursWorked < 1 || hoursWorked > 12) {
            System.out.println("Enter a number between 1 and 12");
            hoursWorked = input.nextInt();
        }
        BabysittingJob ca = new BabysittingJob(year, jobNumber, babysitterCode, childrenNumber,diaper, hoursWorked);
        ca.displayResult();
    }
}
//Greg Maka

import java.util.Scanner;

public class EightInts {

    public static void main(String[] args) {

        int[] array = new int[8];
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (scan.hasNextInt()) {
            array[i] = scan.nextInt();
            i++;
            if (i == 8) {
                break;
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print("" + array[j] + (j<(array.length-1)?" ":"\n"));
        }
        
        for (int j = array.length -1; j >= 0; j--) {
            System.out.print("" + array[j] + (j<(array.length-1)?" ":"\n"));
        }

            }

}
   
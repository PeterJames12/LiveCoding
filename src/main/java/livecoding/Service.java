package livecoding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Igor Hnes on 7/9/17.
 */
public class Service {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String arr[] = new String[10];
        int[] mas = new int[10];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value to arr");
            arr[i] = scanner.nextLine();
        }


        for (int i = 0; i < arr.length; i++) {
            mas[i] = Integer.parseInt(arr[i]);
        }

        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            arr[i] = String.valueOf(mas[i]);
        }


        scanner.close();

    }
}

package HW3;

import java.util.Scanner;

public class Hw_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the number");

        if (a % 2 == 0){
            System.out.println("Number: " + a + " even");
        } else {
            System.out.println("Number: " + a + " odd");
        }

    }

}

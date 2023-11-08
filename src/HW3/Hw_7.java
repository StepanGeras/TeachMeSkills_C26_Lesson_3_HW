package HW3;

import java.util.Scanner;

public class Hw_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 or more");
        int a = scanner.nextInt();
        int n = 0;

        while(a < 1){
            System.out.println("Enter a number from 1 or more");
            a = scanner.nextInt();
        }

        for (int i = 1; i <= a; i++){
            n = n + i;
        }

        System.out.println("Sum of all numbers from 1 to " + a + " = " + n);

    }

}

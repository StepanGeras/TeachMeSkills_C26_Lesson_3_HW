package HW3;

import java.util.Scanner;

public class Hw_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int t = scanner.nextInt();

        if (t > -5){
            System.out.println("Warm");
        } else if (t > -20){
            System.out.println("Normal");
        } else if (t < -20){
            System.out.println("Cold");
        }

    }

}

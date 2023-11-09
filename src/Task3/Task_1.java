package Task3;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов до 100: ");
        int c = scanner.nextInt();

        while (c > 100){
            System.out.println("Введите количество элементов до 100: ");
            c = scanner.nextInt();
        }

        long a = 0;
        long b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 0; i < c; i++){
            long sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

    }

}

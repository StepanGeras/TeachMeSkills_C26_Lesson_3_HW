package Task3;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру (вводить число): \n" +
                "1.Прямоугольник. \n" +
                "2.Треугольник \n" +
                "3.Круг");
        int figure = scanner.nextInt();

        switch (figure){
            case 1:
                System.out.print("Введите стороны прямоугольника: ");
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                double square1 = a1 * b1;
                System.out.println("Площадь прямоугольника равна = " + square1);
                break;
            case 2:
                System.out.print("Введите стороны треугольника: ");
                double a2 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                double c2 = scanner.nextDouble();
                if (a2 + b2 <= c2 | b2 + c2 <= a2 | a2 + c2 <= b2){
                    System.out.println("Такой треугольник не сущестует");
                    break;
                }
                double p = (a2 + b2 + c2) / 2;
                double square2 = Math.sqrt(p * (p - a2) * (p - b2) * (p - c2));
                System.out.println("Площадь треугольника равна = " + square2);
                break;
            case 3:
                System.out.print("Введите радиус круга: ");
                double r = scanner.nextDouble();
                double square3 = Math.PI * Math.pow(r, 2);
                System.out.println("Площадь круга равна = " + square3);
        }

    }

}

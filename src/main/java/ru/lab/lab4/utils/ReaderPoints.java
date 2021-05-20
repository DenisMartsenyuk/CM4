package ru.lab.lab4.utils;

import ru.lab.lab4.entities.Points;

import java.io.FileReader;
import java.util.Scanner;

public class ReaderPoints {
    private Points points;
    Scanner scanner;

    public ReaderPoints() {
        points = new Points();
    }

    public void read() {
        try {
            scanner = new Scanner(System.in);

            System.out.println("Каким образом будете вводить данные? Введите 'f' если из файла, 'k' - клавиатуры. ");
            String type = scanner.nextLine();
            if (!type.equals("f") && !type.equals("k")) {
                System.out.println("Выбран несуществующий тип ввода данных.");
                System.exit(0);
            }

            boolean isKeyboard = true;
            if (type.equals("f")) {
                isKeyboard = false;
                System.out.println("Введите путь до файла.");
                String path = scanner.nextLine();
                FileReader fileReader = new FileReader(path);
                scanner.close();
                scanner = new Scanner(fileReader);
            }

            if (isKeyboard) {
                System.out.println("Введите количество точек. Точек должно быть не менее 12.");
            }
            int n = scanner.nextInt();
//            if (n < 12) {
//                System.out.println("Неверное количество точек.");
//                System.exit(0);
//            } //todo убрать

            if (isKeyboard) {
                System.out.println("Введите координаты точек через пробел. По точке на строку. (x y)\n \"ВАЖНО! Точки надо вводить по возрастанию x.");
            }
            readPoints(n);


        } catch (Exception e) {
            System.out.println("Произошла ошибка при чтении данных.");
            System.exit(0);
        }
    }

    private void readPoints(int n) {
        String line = scanner.next();
        line = line.replace(',', '.');
        double x = Double.parseDouble(line);
        line = scanner.next();
        line = line.replace(',', '.');
        double y = Double.parseDouble(line);
        double previousX = x;
        points.addPoint(x, y);

        for (int i = 1; i < n; ++i) {
            line = scanner.next();
            line = line.replace(',', '.');
            x = Double.parseDouble(line);
            if (x < previousX) {
                System.out.println("Точки введены не по возрастанию.");
                System.exit(0);
            }
            line = scanner.next();
            line = line.replace(',', '.');
            y = Double.parseDouble(line);
            previousX = x;
            points.addPoint(x, y);
        }
    }

    public Points getPoints() {
        return points;
    }
}

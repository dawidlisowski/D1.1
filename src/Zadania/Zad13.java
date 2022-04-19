package Zadania;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a%3 == 0||a%5 == 0) {
            System.out.println("Podzielne przez 3 lub 5");
        } else {
            System.out.println("Niepodzielne przez 3 ani przez 5");
        }
    }
}

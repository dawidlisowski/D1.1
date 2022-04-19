package Zadania;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a%3 == 0) {
            System.out.println("Liczba podzielna przez 3");
        } else {
            System.out.println("nie");
        }
    }
}

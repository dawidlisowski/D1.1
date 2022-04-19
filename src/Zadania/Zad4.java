package Zadania;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.endsWith("a")) {
            System.out.println("Żeńskie");
        }else{
            System.out.println("Męskie");
        }
    }
}

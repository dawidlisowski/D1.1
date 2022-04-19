package Zadania;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if (word.equals("Akademia")){
            System.out.println("Akademia");
        } else {
            System.out.println("Nie");
        }
    }
}

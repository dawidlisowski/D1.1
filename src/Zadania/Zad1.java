package Zadania;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
//        int a = Integer.parseInt(scanner.nextLine());
        int a = scanner.nextInt();

        if (a > 5){
            System.out.println(a + " > 5");
        } else if (a == 5) {
            System.out.println(a + " = 5");
        } else {
            System.out.println(a + " < 5");
        }
    }
}

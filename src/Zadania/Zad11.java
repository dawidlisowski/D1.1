package Zadania;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.contains("kajak")){
            System.out.println("Kajak");
        }else{
            System.out.println("no");
        }
    }
}

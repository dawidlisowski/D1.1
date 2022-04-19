package Zadania;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.endsWith("M")){
            System.out.println("M");
        }else if (word.endsWith("m")){
            System.out.println("m");
        }else{
            System.out.println("No M/m");
        }
    }
}

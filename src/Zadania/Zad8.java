package Zadania;

import java.util.Locale;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase(Locale.ROOT);
//        char first = word.charAt(0);
//        char last = word.charAt(word.length());
//        if (first == last){
//            System.out.println("tak");
//        }else {
//            System.out.println("nie");
//        }
        if (word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println("tak");
        }else {
            System.out.println("nie");
        }
    }
}

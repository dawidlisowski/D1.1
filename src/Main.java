import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

//        System.out.println(word);

//        System.out.println("Hello World");
//
//        int cos5 = 5 * 5;
//
//        if (cos5 > 20 && cos5 < 25) {
//            System.out.println("Hejo 20");
//        }else if (cos5 == 22){
//            System.out.println("Hejo 22");
//        } else {
//            System.out.println("nic z tego");
//        }

        int integerWord = Integer.parseInt(word);

        System.out.println(integerWord);

    }
}

import java.util.Random;
import java.util.Scanner;

public class Bataille {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

       System.out.println("Nom du joueur A : " );
       String joueurA = scanner.nextLine();


        System.out.println("Nom du joueur B : " );
        String joueurB = scanner.nextLine();


        System.out.println("Nom du joueur B : " + joueurA );


    }
}

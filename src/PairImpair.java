import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        int nombre = scanner.nextInt();
        if(nombre % 2==0){
            System.out.println(" le nombre est un nombre pair");
        } else {
            System.out.println("le nombre est un nombre impair");
        }



    }
}
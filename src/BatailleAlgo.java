import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BatailleAlgo {


    public  static void main(String[] args){
        List<Integer> nbrParty = Arrays.asList(1,2,3,4,5);
        List<Integer> joueurA = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> joueurB = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Random random = new Random();

        Integer score_joueur_A= 0;
        Integer score_joueur_B= 0;


        for(Integer partie : nbrParty ){
            int randomCard_A = random.nextInt(joueurA.size());
            int randomCard_B = random.nextInt(joueurB.size());

            System.out.println("Partie " + partie );
            System.out.println("Joueur A a joué "+ randomCard_A);
            System.out.println("Joueur B a joué "+ randomCard_B);

            if(randomCard_A > randomCard_B){
                System.out.println(" Joueur A a joué la partie " + partie);
                score_joueur_A ++;
            } else if(randomCard_B > randomCard_A){
                System.out.println("Joueur B a joué la partie " + partie);
                score_joueur_B ++;
            } else {
                System.out.println("egalité");
            }





        }

        System.out.println("Le score final est de , Joueur A :" + score_joueur_A + " | joueur B :" + score_joueur_B);

    }








}

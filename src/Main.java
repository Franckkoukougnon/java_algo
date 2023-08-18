import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {



       Auto monAuto = new Auto("lexus",10,"essence");

       if (monAuto.quantiteEssence < 20){
           if (monAuto.typeEssence.equals("essence")){
               monAuto.mettreEssence(75);
           } else if(monAuto.typeEssence.contains("diesel")){
               monAuto.mettreEssence(60);
           }

       }
       monAuto.demarrerAuto();
       System.out.println("vous avez mis "+ monAuto.quantiteEssence+ " et le type de carburant est "+ monAuto.typeEssence+ " et Vous avez une "+monAuto.nom);




        Auto monAuto2 = new Auto("Mercedes",5,"essence");

        if (monAuto2.quantiteEssence < 20){
            if (monAuto2.typeEssence.equals("essence")){
                monAuto2.mettreEssence(120);
            } else if(monAuto2.typeEssence.contains("diesel")){
                monAuto2.mettreEssence(170);
            }

        }

        System.out.println("vous avez mis "+ monAuto2.quantiteEssence+ " et le type de carburant est "+ monAuto2.typeEssence+ " et Vous avez une "+monAuto2.nom);



        List<Auto> myAutoList = new ArrayList<Auto>();
        myAutoList.add(monAuto2);
        myAutoList.add(monAuto);
        myAutoList.size();

        System.out.println("Taille de la liste" + myAutoList.size());

        for(Auto myAuto : myAutoList){
            System.out.println("Auto "+ myAuto.nom + " , Type de carburant : "+ myAuto.typeEssence);
        }





    }





}
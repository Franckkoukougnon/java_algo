public class Main {
    public static void main(String[] args) {
       Voiture voiture1 = new Voiture("gle", "mercedes");
       Moto moto1 = new Moto("xmax 125","Yamaha");
       voiture1.demarrer();
       voiture1.activerAIrBag();
       voiture1.makeSound();
        String bruitVoiture =  voiture1.makeSound();
       System.out.println("la voiture " + voiture1.nom + " faire un bruit " + bruitVoiture);


       Auto monAuto = new Auto("lexus",10,"essence");

       if (monAuto.quantiteEssence < 20){
           if (monAuto.typeEssence.equals("essence")){
               monAuto.mettreEssence(75);
           } else if(monAuto.typeEssence.contains("diesel")){
               monAuto.mettreEssence(60);
           }

       }
       monAuto.demarrerAuto();
       System.out.println("vous avez mis "+ monAuto.quantiteEssence+ " et le type de carburant est "+ monAuto.typeEssence);








    }
}

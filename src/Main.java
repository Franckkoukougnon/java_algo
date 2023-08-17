public class Main {
    public static void main(String[] args) {
       Voiture voiture1 = new Voiture("gle", "mercedes");
       Moto moto1 = new Moto("xmax 125","Yamaha");
       voiture1.demarrer();
       voiture1.activerAIrBag();

       moto1.mettreBequille();
       moto1.demarrer();

    }
}

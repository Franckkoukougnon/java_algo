public class Voiture extends Vehicule {


    public Voiture(String nom, String marque) {
        super(nom, marque);
    }

    @Override
    public void demarrer() {
        System.out.println("je demarre ma "+nom);

    }

    @Override
    String makeSound() {

        return "Vroomm";
    }


}

public class Moto extends  Vehicule implements ActionVehicule{

    public Moto(String nom, String marque) {
        super(nom, marque);
    }



    @Override
    public void demarrer() {
        System.out.println("je demarre ma "+nom);

    }

    @Override
    String makeSound() {
        System.out.println("Brooommm !!!");
        return null;
    }

    @Override
    public void freiner() {

    }

    @Override
    public void passerVitesse() {

    }


}

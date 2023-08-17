public class Moto extends  Vehicule{

    public Moto(String nom, String marque) {
        super(nom, marque);
    }

    @Override
    public void demarrer() {
        System.out.println("je demarre ma "+nom);

    }
}

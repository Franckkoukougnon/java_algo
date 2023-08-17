public abstract class Vehicule {
    String nom;
    String marque;

    public Vehicule(String nom, String marque) {
        this.nom = nom;
        this.marque = marque;
    }

    public abstract void demarrer();

    public  void activerAIrBag(){
        System.out.println("je demarre ma "+nom);
    };

    public void mettreBequille(){
        System.out.println("mettre bequille de ma "+marque);
    }
}

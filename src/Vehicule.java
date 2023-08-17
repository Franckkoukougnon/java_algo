public abstract class Vehicule {
    public String nom;
    private String marque;
    protected String puissance;

    public Vehicule(String nom, String marque) {
        this.nom = nom;
        this.marque = marque;
    }

    public abstract void demarrer();

    String makeSound(){
        System.out.println("faire du bruit");
        return null;
    }

    public  void activerAIrBag(){
        System.out.println("je demarre ma "+nom);
    };

    public void mettreBequille(){
        System.out.println("mettre bequille de ma "+marque);
    }
}

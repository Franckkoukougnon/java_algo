abstract class Employe {
   public String nom;
   public String prenom;
   public int age;
    public String dateEntree;

    public Employe(String nom, String prenom, int age, String dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public String getNom() {
        return "l'employe s'appelle"+ nom;
    }

    public abstract double calculeSalaire();
}

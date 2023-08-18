public class EmployeProd extends Employe {


    int nbreprod;
    public EmployeProd(String nom, String prenom, int age, String dateEntree) {
        super(nom, prenom, age, dateEntree);
        this.nbreprod = nbreprod;
    }

    @Override
    public double calculeSalaire() {
        return nbreprod * 5;
    }
}

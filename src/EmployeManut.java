public class EmployeManut extends Employe {

    int nbreHeure;
    public EmployeManut(String nom, String prenom, int age, String dateEntree) {
        super(nom, prenom, age, dateEntree);
        this.nbreHeure  = nbreHeure;
    }

    @Override
    public double calculeSalaire() {
        return nbreHeure * 65;
    }
}

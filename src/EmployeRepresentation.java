public class EmployeRepresentation extends Employe {


    int chiffreAffaire;
    public EmployeRepresentation(String nom, String prenom, int age, String dateEntree) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculeSalaire() {
        return 0.2* chiffreAffaire+800;
    }
}

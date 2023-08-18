public class EmployeVente extends Employe {

    int chiffreA;

    public EmployeVente(String nom, String prenom, int age, String dateEntree) {
        super(nom, prenom, age, dateEntree);
        this.chiffreA  = chiffreA;
    }


    @Override
    public double calculeSalaire() {
        return 0.2* chiffreA +400;
    }
}

public class EmployeManutRisque extends EmployeManut implements EmployeRisque {


    public EmployeManutRisque(String nom, String prenom, int age, String dateEntree) {
        super(nom, prenom, age, dateEntree);
    }

    @Override
    public double calculerPrime() {
        return PRIME_RISQUE;
    }

    @Override
    public  double calculeSalaire() {
        return super.calculeSalaire() + calculerPrime();

    }
}

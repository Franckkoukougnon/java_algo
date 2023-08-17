public class Auto {
    public String nom;
    public int quantiteEssence;
    public String typeEssence;

    public Auto(String nom, int quantiteEssence, String typeEssence) {
        this.nom = nom;
        this.quantiteEssence = quantiteEssence;
        this.typeEssence = typeEssence;
    }

    public String mettreEssence(int qte_essence){
        quantiteEssence += qte_essence;
        return (" vous avez mis "+  qte_essence+" de litres d'essence");
    }

    void demarrerAuto(){
        System.out.println("auto en route");
    }
}

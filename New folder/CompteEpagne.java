public class CompteEpagne extends Compte {
    public static int cNB = 0;
    public double taux;

    public CompteEpagne(double s, Agence ag, Client cl) {
        cNB++;
        this.code = "CompteEpagne " + cNB;
        solde = s;
        lAgence = ag;
        Propriataire = cl;
        taux = 6;

    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public void calculInteret() {

    }

    @Override
    public void deposer(double dp) {
        dp -= taux;
        solde += dp;
    }

    @Override
    public void retirer(double rt) {
        rt += taux;
        solde -= rt;
    }

    @Override
    double getSold() {
        return solde;
    }

    @Override
    String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "CompteEpagne{" +
        // "code='" + super.code + '\'' +
                ", solde=" + solde +
                ", lAgence=" + lAgence.getNum() +
                ", Propriataire = " + Propriataire.nom +
                '}';
    }

}

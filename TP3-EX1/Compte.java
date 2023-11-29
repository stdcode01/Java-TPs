class Compte {
    public static int cNB = 0;
    String code;
    protected double solde;
    protected Agence lAgence;
    protected Client Propriataire;

    public Compte() {
        // this.solde = solde;
        // this.lAgence = lAgence;
        // this.Propriataire = Propriataire;
    }

    String getCode() {
        return this.code;
    };

    public void setCode(String code) {
    };

    public void deposer(double dp) {
    };

    public void retirer(double rt) {
    }

    double getSold() {
        return solde;
    }

}
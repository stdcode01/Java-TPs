class Compte {
    public static int cNB = 0;
    String code;
    protected double solde;
    protected Agence lAgence;
    protected Client Propriataire;

    public Compte() {
        cNB++;
        // this.code =getClass.getName()+cNB;
        // this.solde = solde;
        // this.lAgence = lAgence;
        // this.Propriataire = Propriataire;
    }

    public String getCode() {
        return this.code;
    };

    public void setCode(String code) {

    };

    void deposer(double dp) {

    };

    void retirer(double rt) {
        // -rt
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code='" + code + '\'' +
                ", solde=" + solde +
                ", lAgence=" + lAgence +
                ", Proprties=" + Propriataire +
                '}';
    }
}
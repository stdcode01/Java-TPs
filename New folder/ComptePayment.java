public class ComptePayment extends Compte {
  public static int cNB = 0;

  final double taux_operation;

  public ComptePayment(double solde, Agence ag, Client cl) {
    cNB++;
    this.code = "ComptePayment " + cNB;
    super.solde = solde;
    super.lAgence = ag;
    super.Propriataire = cl;
    this.taux_operation = 5;
  }

  @Override
  public void deposer(double dp) {
    dp -= taux_operation;
    solde += dp;
  }

  @Override
  public void retirer(double rt) {
    rt += taux_operation;
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
    return "ComptePayment{" +
        "code='" + code + '\'' +
        ", solde=" + solde +
        ", lAgence=" + lAgence.getNum() +
        ", Propriataire = " + Propriataire.nom + " " + Propriataire.prenom +
        '}';
  }
}
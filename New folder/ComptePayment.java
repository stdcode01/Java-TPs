public class ComptePayment extends Compte {
  final double taux_operation;

  public ComptePayment(double solde, Agence ag, Client cl, double t) {
    super.solde = solde;
    super.lAgence = ag;
    super.Propriataire = cl;
    this.taux_operation = t;
  }

  public void deposer(double dp) {
    // + dp
  }

  public void retirer(double rt) {
    // - rt
  }

  @Override
  public String toString() {
    return "ComptePayment{" + "taux_operation = " + taux_operation + " }";
  }
}
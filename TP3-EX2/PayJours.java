/**
 * PayJours
 */
public class PayJours extends Employees {

  double Nb_jour, p_parJour;
  final String Matricule;

  PayJours(String Mt, String n, String ad) {
    Matricule = Mt;
    Nom = n;
    Address = ad;
    // Nb_jour = nb_j;
    // p_parJour = p_parJ;
    // salary = Nb_jour * p_parJour;
  }

  public void setSalary(double nb_j, double p_parJ) {
    salary = nb_j * p_parJ;
  }

  public double getSalary() {
    return salary >= 0.0 ? salary : 0.0;
  }
}
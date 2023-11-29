/**
 * PayHeurs
 */
public class PayHeurs extends Employees {

  double Nb_heur, p_parHeur;
  final String Matricule;

  PayHeurs(String Mt, String n, String ad) {
    Matricule = Mt;
    Nom = n;
    Address = ad;
    // Nb_heur = nb_h;
    // p_parHeur = p_parH;
  }

  public void setSalary(double nb_h, double p_parH) {
    salary = nb_h * p_parH;
  }

  public double getSalary() {
    return salary >= 0.0 ? salary : 0.0;
  }

}
public class PayFixWeek extends Employees {

  final String Matricule;

  PayFixWeek(String Mt, String n, String ad, double s) {
    Matricule = Mt;
    Nom = n;
    Address = ad;
    salary = s;
  }

  public void setSalary(double s) {
    this.salary = s;
  }

  public double getSalary() {
    return this.salary;
  }
}

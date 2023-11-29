class Employees {
  /// final int Matricule will be in child class
  protected String Nom, Address;
  protected double salary;

  public Employees() {
  }

  // Set & Get

  public void setNom(String nom) {
    this.Nom = nom;
  }

  public String getNom() {
    return this.Nom;
  }

  public void setAddress(String address) {
    this.Address = address;
  }

  public String getAddress() {
    return this.Address;
  }

  public void setSalary(double s) {
    this.salary = s;
  }

  public double getSalary() {
    return this.salary;
  }

}
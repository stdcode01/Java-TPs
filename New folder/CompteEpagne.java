public class CompteEpagne extends Compte{
  public double taux;
 
    public CompteEpagne(double solde,Agence ag,Client cl,double taux ) {
        super.solde=solde;
        super.lAgence=ag;
        super.Propriataire=cl;
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }
    
    public void setTaux(double taux) {
        this.taux = taux;
    }
    public void calculInteret(){}
    
    @Override
    public String toString(){
        return "CompteEpagne{"+ "taux = "+taux+" }";
    }
  }
  
import java.util.Arrays;

class Client {
    private static int cNB = 0;
    private static int i = 0;
    String code, nom, prenom, addresse;
    Agence monAgence;
    Compte mesComptes[] = new Compte[3];

    public Client(String nom, String prenom, String addresse, Agence monAgence) {
        cNB++;
        this.code = "Client " + cNB;
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.monAgence = monAgence;
        // this.mesComptes = new Compte[10];
    }

    public String getCode() {
        return code;
    }

    public Compte getCompte(int i) {
        return mesComptes[i];
    }

    public int getNbComptes() {
        return mesComptes.length;
    }

    public void addCompt(Compte c) {
        mesComptes[i] = c;
        i++;
        // add compte by create new array(lenght++) and copy old one on it;
    }

    public void deposer(int i, double dp) {
    }

    public void retirer(int i, double rt) {
    }

    @Override
    public String toString() {
        return "Client{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", addresse='" + addresse + '\'' +
                ", monAgence=" + monAgence +
                ", mesComptes=" + Arrays.toString(mesComptes) +
                '}';
    }
}
import java.util.Arrays;

class Client {
    private static int cNB = 0;
    private static int i = 0;
    String code, nom, prenom, addresse;
    Agence monAgence;
    Compte mesComptes[] = new Compte[10];

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
        if (i < 10) {
            mesComptes[i] = c;
            i++;
        } else {
            System.out.println("you couldn't create more than 5 compte ");
        }
        // add compte by create new array(lenght++) and copy old one on it;
    }

    public void deposer(int i, double dp) {
        mesComptes[i].deposer(dp);
    }

    public void retirer(int i, double rt) {
        mesComptes[i].retirer(rt);
    }

    @Override
    // public String toString() {
    // return "Client{" +
    // "code='" + code + '\'' +
    // ", nom='" + nom + '\'' +
    // ", prenom='" + prenom + '\'' +
    // ", addresse='" + addresse + '\'' +
    // ", monAgence=" + monAgence.getNum()+
    // ", mesComptes= " + for(int i=0;i<mesComptes.length;i++) return
    // mesComptes[i].getCode()+" - " +
    // '}';
    // }

    public String toString() {
        StringBuilder result = new StringBuilder("Client{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", addresse='" + addresse + '\'' +
                ", monAgence=" + monAgence.getNum() +
                ", mesComptes = [ ");

        if (mesComptes.length > 0) {
            for (int i = 0; i < mesComptes.length; i++) {
                if (mesComptes[i] != null)
                    result.append(mesComptes[i].getCode()).append(" - ");
            }
        }

        // // Remove the trailing " - " if there are accounts
        if (mesComptes.length > 0) {
            result.setLength(result.length() - 3);
        }

        result.append("]}");

        return result.toString();
    }

}
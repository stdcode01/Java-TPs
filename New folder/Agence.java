import java.util.Arrays;

class Agence {

    private static int i = 0, j = 0;
    private String num, addresse;
    private Client[] clientes = new Client[100];
    private Compte[] comptes = new Compte[150];

    public Agence(String num, String addresse) {
        this.num = num;
        this.addresse = addresse;
    }

    String getNum() {
        return this.num;
    }

    public Client getClient(int i) {
        return clientes[i];
    }

    public Compte getCompte(int i) {
        return comptes[i];
    }

    public void AddClient(Client c) {
        clientes[j] = c;
        j++;

    }

    public void AddCompte(Compte c) {
        comptes[i] = c;
        i++;

    }

    public int getNbClients() {

        return clientes.length;
    }

    public int getNbComptes() {

        return comptes.length;
    }

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder(
                "Agence{" +
                        "num='" + num + '\'' +
                        ", addresse='" + addresse + '\'' +
                        ",Clientes : [");

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null)
                res.append(clientes[i].nom).append(" ")
                        .append(clientes[i].prenom).append(" - ");
        }
        res.append("],Comptes : [");

        for (int i = 0; i < clientes.length; i++) {
            if (comptes[i] != null)
                res.append(comptes[i].getCode()).append(" - ");
        }
        res.append("]}");

        return res.toString();
    }
}
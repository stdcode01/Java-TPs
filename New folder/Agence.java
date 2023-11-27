import java.util.Arrays;

class Agence {

    private static int i = 0;
    String num, addresse;
    Client[] clientes = new Client[2];
    Compte[] comptes = new Compte[2];

    public Agence(String num, String addresse) {
        this.num = num;
        this.addresse = addresse;
    }

    public Client getClient(int i) {
        return clientes[i];
    }

    public Compte getCompte(int i) {
        return comptes[i];
    }

    public void AddClient(Client c) {
        clientes[i] = c;
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
        return "Agence{" +
                "num='" + num + '\'' +
                ", addresse='" + addresse + '\'' +
                ", clientes=" + "Arrays.toString(clientes)" +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }
}
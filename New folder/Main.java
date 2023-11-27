
public class Main {
	public static void main(String[] args) {
		// String nom, prenom, addresse;
		String numAg = "agence866", adressAg = "agadir-dakhla_76";

		Agence ag1 = new Agence(numAg, adressAg);

		Client cl1 = new Client("ahmed", "adli", "R-292 agadir", ag1);
		Client cl2 = new Client("hassan", "iobnsala", "R-172 agadir", ag1);
		Client cl3 = new Client("jamal", "ador", "R-02 agadir", ag1);
		Client cl4 = new Client("ali", "medo", "R-312 agadir", ag1);

		ComptePayment cpm1 = new ComptePayment(1000, ag1, cl1, 12.12);

		// CompteEpagne cpe1 = new CompteEpagne(2500, ag1, cl2, 12.12);

		// add compte to client !
		cl1.addCompt(cpm1);
		// cl2.addCompt(cpe1);

		// ajoute client to agence ;
		ag1.AddClient(cl1);
		// ag1.AddClient(cl2);

		// ag1.toString();
		System.out.println(ag1.toString());

	}
}
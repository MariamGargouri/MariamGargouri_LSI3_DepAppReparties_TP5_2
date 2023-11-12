package rmiClient;
import java.rmi.Naming;
import java.sql.Date;

import metier.Compte;
import rmiService.IBanque;

public class BanqueClient {
public static void main(String[] args) {
	try {
		/// Recherche l'objet distant dans le registre RMI à l'adresse "rmi://localhost:1099/objectDistant"
		IBanque stub=(IBanque)Naming.lookup("rmi://localhost:1099/objectDistant");
		
		Compte c = new Compte(1,100,new Date(0));//Crée un objet Compte
		// Appelle la méthode creerCompte de l'objet distant et affiche le résultat
		System.out.println(stub.creerCompte( c));
		// Appelle la méthode getInfoCompte de l'objet distant avec l'identifiant de compte 3 et affiche le résultat
		System.out.println(stub.getInfoCompte(3));
		} catch (Exception e) {}
	
}
}



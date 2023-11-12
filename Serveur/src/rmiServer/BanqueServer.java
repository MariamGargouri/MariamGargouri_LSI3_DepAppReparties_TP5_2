package rmiServer;

import java.rmi.Naming;//pour enregistrer des objets RMI dans un registre
import java.rmi.registry.LocateRegistry;//pour créer un registre RMI.
import rmiService.BanqueImpl;

public class BanqueServer {
	public static void main(String[] args) 
	{
		try {
			LocateRegistry.createRegistry(1099);//Crée un registre RMI sur le port 1099
			
			BanqueImpl od = new BanqueImpl(); // Crée une instance de l'implémentation de l'objet distant (BanqueImpl)
			
			System.out.println(od.toString());// Affiche les informations de l'objet distant
			
			Naming.rebind("rmi://localhost:1099/objectDistant",od);//// Enregistre l'objet distant dans le registre RMI sous la référence "objectDistant"
		} catch (Exception e) {e.printStackTrace();}
		
	}

}

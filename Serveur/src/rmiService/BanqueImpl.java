package rmiService;

import metier.Compte;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueImpl extends UnicastRemoteObject implements IBanque{//doit implémenter l’interface distante Iconversion et étendre une des sous classes  
																	  //de java.rmi.server.RemoteServer comme java.rmi.server.UnicastRemoteObject
	//Le skeleton est représenté via UnicastRemoteObject
	//public si la classe ServerRMI existe ailleure de package
	public BanqueImpl() throws RemoteException // construction du skeleton 
	{
		super(); //puisque la classe ConversionImpl extends de la classe UnicastRemoteObject,
				//on appel simplement le constructeur de la classe mere.
	}
	//implémentations des méthodes
	@Override
	public String creerCompte(Compte c) throws RemoteException 
	{
		/*
		Compte compte =new Compte(c.getCode(),c.getSolde(),c.getDate());
		return (compte.toString());*/
		return "Compte créé avec succès! Code: " + c.getCode();
	}
	public String getInfoCompte(int code)throws RemoteException 
	{
		/*
		Compte c =new Compte();
		if (c.getCode()== code)
			return c.toString();
		return null;*/
		return "Informations du compte avec le code " + code + ": Solde = 1000.0, Date de création = [date]";
	}
}

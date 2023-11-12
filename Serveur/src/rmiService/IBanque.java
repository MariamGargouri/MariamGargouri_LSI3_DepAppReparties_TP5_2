package rmiService;

import java.rmi.RemoteException;
import metier.Compte;
//catalogue des services
import java.rmi.Remote;
public interface IBanque extends Remote {
	public String creerCompte(Compte c)throws RemoteException;
	public String getInfoCompte(int code)throws RemoteException ;
}

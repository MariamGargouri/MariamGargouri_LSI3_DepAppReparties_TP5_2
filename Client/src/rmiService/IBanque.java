package rmiService;
import java.rmi.RemoteException;
import metier.Compte;
import java.rmi.Remote;
//cataloque des services
public interface IBanque extends Remote {
	public String creerCompte(Compte c)throws RemoteException;
	public String getInfoCompte(int code)throws RemoteException ;
}

import java.rmi.*;

public interface ServerIntF extends Remote{
    double mul (double d1, double d2) throws RemoteException;
}
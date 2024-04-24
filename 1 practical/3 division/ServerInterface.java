import java.rmi.*;

public interface ServerInterface extends Remote {
    public double div(double d1, double d2) throws RemoteException;
}
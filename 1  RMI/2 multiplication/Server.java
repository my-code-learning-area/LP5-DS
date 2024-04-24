import java.rmi.*;
import java.rmi.server.*; // needed for implementation

class Implementation extends UnicastRemoteObject implements ServerIntF {

    public Implementation () throws RemoteException {

    }

    public double mul (double d1, double d2) throws RemoteException {
        return d1 * d2;
    }
}

public class Server {
    public static void main(String args[]) {
        try {
            Implementation imp = new Implementation();
            Naming.rebind("Server", imp);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
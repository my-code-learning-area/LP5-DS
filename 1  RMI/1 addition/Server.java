import java.rmi.*;
import java.rmi.server.*;

class ServerImplementation extends UnicastRemoteObject implements ServerInterface {
    public ServerImplementation () throws RemoteException {}

    public double add(double d1, double d2) throws RemoteException {
        return d1 + d2;
    }
}

public class Server {
    public static void main(String args[]) {
        try {
            ServerImplementation si = new ServerImplementation();
            Naming.rebind("Server", si);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
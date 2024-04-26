import java.rmi.*;
import java.time.LocalTime;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {
    LocalTime localTime;

    public ServerImplementation(LocalTime localTime) throws RemoteException {
        this.localTime = localTime;
    }

    public LocalTime getTime() throws RemoteException {
        return this.localTime;
    }

    public void adjustTime(LocalTime serverTime, long diff) throws RemoteException {
        this.localTime = serverTime.plusSeconds(diff);
        System.out.println("Adjusted time is: " + this.localTime);
    }

}
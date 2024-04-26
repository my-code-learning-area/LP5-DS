import java.rmi.*;
import java.rmi.server.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

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
        System.out.println("Adjusted time is: " + this.localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

}
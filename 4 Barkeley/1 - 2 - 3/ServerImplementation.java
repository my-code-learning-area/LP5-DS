import java.rmi.*;
import java.rmi.server.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {
    private LocalTime localTime;

    public ServerImplementation(LocalTime localTime) throws RemoteException {
        this.localTime = localTime;
    }

    public LocalTime getTime() throws RemoteException {
        return this.localTime;
    }

    public void adjustTime(LocalTime serverTime, long diff) throws RemoteException {
        long adjustedSeconds = diff + serverTime.toSecondOfDay();

        this.localTime = LocalTime.ofSecondOfDay(adjustedSeconds);
        System.out.println("Adjusted time is: " + this.localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

}
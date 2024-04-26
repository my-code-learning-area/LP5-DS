import java.rmi.*;
import java.time.*;

public interface ServerInterface extends Remote{
    LocalTime getTime() throws RemoteException;
    void adjustTime(LocalTime serverTime, long diff) throws RemoteException;
}
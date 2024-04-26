import java.rmi.*;
import java.rmi.registry.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C {
    public static void main(String args[]) {
        try {
            ServerImplementation serverImpl = new ServerImplementation(LocalTime.parse(args[1], DateTimeFormatter.ofPattern("HH:mm:ss")));
            Naming.rebind(args[0], serverImpl);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
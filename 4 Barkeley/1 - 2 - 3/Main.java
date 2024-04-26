import java.rmi.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        try {
            String clock1 = "rmi://localhost/" + args[0];
            String clock2 = "rmi://localhost/" + args[1];
            String clock3 = "rmi://localhost/" + args[2];

            ServerInterface c1 = (ServerInterface) Naming.lookup(clock1);
            System.out.println(c1.getTime());
            ServerInterface c2 = (ServerInterface) Naming.lookup(clock2);
            System.out.println(c2.getTime());
            ServerInterface c3 = (ServerInterface) Naming.lookup(clock3);
            System.out.println(c3.getTime());

            LocalTime serverTime = LocalTime.parse("03:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println("Server time is: " + serverTime);

            long serverSeconds = serverTime.toSecondOfDay();
            long c1Seconds = c1.getTime().toSecondOfDay() - serverSeconds;
            long c2Seconds = c2.getTime().toSecondOfDay() - serverSeconds;
            long c3Seconds = c3.getTime().toSecondOfDay() - serverSeconds;
            long avg = (c1Seconds + c2Seconds + c3Seconds) / 4;

            c1.adjustTime(serverTime, avg);
            c2.adjustTime(serverTime, avg);
            c3.adjustTime(serverTime, avg);
            serverTime = serverTime.plusSeconds(avg);

            System.out.println("The adjusted time is : " + serverTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
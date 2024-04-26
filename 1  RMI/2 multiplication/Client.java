import java.rmi.*;

public class Client {
    public static void main(String args[]) {
        try {

            // getting reference to the remote object
            String url = "rmi://localhost/Server";
            ServerIntF intF = (ServerIntF) Naming.lookup(url);

            double d1 = Double.parseDouble(args[1]);
            double d2 = Double.parseDouble(args[2]);
            System.out.println("d1 = " + d1);
            System.out.println("d2 = " + d2);
            
            System.out.println("d1 * d2 = " + intF.mul(d1, d2));
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
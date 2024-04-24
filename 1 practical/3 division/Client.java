import java.rmi.*;

public class Client {
    public static void main(String args[]) {

        try {
            //get reference to the remote object
            String url = "rmi://"+args[0]+"/Server";
            ServerInterface si = (ServerInterface) Naming.lookup(url);

            // preparing data
            Double d1 = Double.parseDouble(args[1]);
            Double d2 = Double.parseDouble(args[2]);
            System.out.println("d1 = " + d1);
            System.out.println("d2 = " + d2);        

            // invoke remote method
            System.out.println("d1 / d2 = " + si.div(d1, d2));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
import java.rmi.*;

class AddClient {
    public static void main(String[] args) {
        try {

            // Get reference to the remote object
            String addServerUrl = "rmi://" + args[0] + "/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerUrl);
            
            double d1 = Double.parseDouble(args[1]);
            double d2 = Double.parseDouble(args[2]);

            System.out.println("First number is: " + d1);
            System.out.println("Second number is: " + d2);

            // Invoke remote method to add numbers
            System.out.println("The sum is: " + addServerIntf.add(d1, d2));

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
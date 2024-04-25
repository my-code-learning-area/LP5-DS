import ReverseModule.*; 
import org.omg.CosNaming.*;
import org.omg.CORBA.*; 

import org.omg.PortableServer.*;

class ReverseImpl extends ReversePOA {
	ReverseImpl() {
		super();
		System.out.println("Reverse Object Created");
	}

	public String reverseString(String name) {
		StringBuffer str = new StringBuffer(name); 
		str.reverse(); 
		return str.toString();
	}
}


public class Server {
	public static void main(String[] args) {
		try { 	
            // initialize the ORB
			ORB orb = ORB.init(args, null);
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			
            NameComponent path[] = ncRef.to_name("Reverse"); 

			// initialize the BOA/POA
			POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA")); 
			rootPOA.the_POAManager().activate();
            
			// creating the calculator object 
			ReverseImpl rvr = new ReverseImpl();
			
			// get the object reference from the servant class 
			org.omg.CORBA.Object ref = rootPOA.servant_to_reference(rvr);
			
			Reverse hRef = ReverseModule.ReverseHelper.narrow(ref); 

			ncRef.rebind(path,hRef);
			
			System.out.println("Reverse Server reading and waiting....");
			orb.run();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
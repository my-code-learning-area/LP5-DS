import ReverseModule.*; 
import org.omg.CosNaming.*;
import org.omg.CORBA.*; 

import java.util.Scanner;

public class Client {
	public static void main(String args[]) {
		try {
			// initialize the ORB 
			ORB orb = ORB.init(args, null);
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService"); 
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			Reverse ReverseImpl = ReverseHelper.narrow(ncRef.resolve_str("Reverse"));
			
			System.out.print("Enter String:\n"); 
			Scanner sc = new Scanner(System.in);
			
			String str = sc.nextLine();
			String resultStr = ReverseImpl.reverseString(str);
			
			System.out.println("\nReversed:\n" + resultStr);
		}  catch (Exception e) { 
			e.printStackTrace();
		}
	}
}
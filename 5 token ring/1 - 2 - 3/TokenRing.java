import java.util.*;

public class TokenRing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: \t");
        int n = sc.nextInt();

        // Decide the number of nodes forming the ring
        int token = 0;

        for(int i = 0; i < n; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" " + 0);

        try {
            while(true) {
                System.out.print("Enter Sender: \t");
                int s = sc.nextInt();
                System.out.print("Enter Receiver: \t");
                int r = sc.nextInt();
                System.out.print("Enter Data: \t");
                String data = sc.next();

                System.out.print("\n\nToken Passing:");

                // current token not equal to sender, increment i and j by (j + 1) % n
                for(int i = token; (i % n) != s; i = (i + 1) % n) {
                    System.out.print(" " + i + "->");
                }
                System.out.println(" " + s);

                // start forwarding from node after sender until it becomes equal to receiver and increment  by (i + 1) % n
                System.out.println("Sender " + s + " sending data: " + data);
                for(int i = (s + 1) % n; i != r; i = (i + 1) % n) {
                    System.out.println("Data " + data + " forwarded by " + i);
                }
                System.out.println("Receiver " + r + " received data: " + data);

                token = s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
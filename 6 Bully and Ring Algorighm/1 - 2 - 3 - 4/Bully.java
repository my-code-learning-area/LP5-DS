import java.util.*;

public class Bully {
    int coordinator;
    int maxProcesses;
    boolean processes[];

    public Bully(int max) {
        this.processes = new boolean[max];
        this.maxProcesses = max;
        this.coordinator = max;

        System.out.println("Creating Processes..");
        for(int i = 0; i < max; i++) {
            processes[i] = true;
            System.out.println("P"+(i+1)+" created");
        }
        System.out.println("Process P"+max+" is the coordinator");
    }

    public void displayProcesses() {
        for(int i = 0; i < this.maxProcesses; i++) {
            if(processes[i]) {
                System.out.println("P"+(i+1)+" is up");
            } else {
                System.out.println("P"+(i+1)+" is down");
            }
        }
        System.out.println("Process P"+this.coordinator+" is the coordinator");
    }

    void upProcess(int processID) {
        if(!processes[processID - 1]) {
            processes[processID - 1] = true;
            System.out.println("Process P"+processID+" is up");
        }
    }

    void downProcess(int processID) {
        if(processes[processID - 1]) {
            processes[processID - 1] = false;
            System.out.println("Process P"+processID+" is down");
        }
    }

    void runElection(int processID) {
        this.coordinator = processID;

        for(int i = processID; i < this.maxProcesses; i++) {
            System.out.println("Election message sent from P"+(i)+" to P"+(i+1));

            if(processes[i]) {
                runElection(i+1);
                return;
            }
        }
    }

    public static void main(String args[]) {
        Bully bully = null;
        int maxProcesses = 0, processID = 0, choice = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n\n=============================");
            System.out.println("Bully Algorithm");
            System.out.println("1. Create processes");
            System.out.println("2. Display processes");
            System.out.println("3. Up a process");
            System.out.println("4. Down a process");
            System.out.println("5. Run election algorithm");
            System.out.println("6. Exit Program");
            System.out.print("Enter your choice:- ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter the number of processes:- ");
                    maxProcesses = sc.nextInt();
                    bully = new Bully(maxProcesses);
                    break;
                
                case 2:
                    bully.displayProcesses();
                    break;

                case 3:
                    System.out.print("Enter the process number to up:- ");
                    processID = sc.nextInt();
                    bully.upProcess(processID);
                    break;

                case 4:
                    System.out.print("Enter the process number to down:- ");
                    processID = sc.nextInt();
                    bully.downProcess(processID);
                    break;

                case 5:
                    System.out.print("Enter the process number which will perform election:- ");
                    processID = sc.nextInt();
                    bully.runElection(processID);
                    bully.displayProcesses();
                    break;

                case 6:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Error in choice. Please try again.");
            }
        }
    }
}
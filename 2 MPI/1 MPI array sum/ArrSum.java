import mpi.*;

public class ArrSum {
    public static void main(String args[]) {
        // initialize MPI
        MPI.Init(args);

        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();

        int unitSize = 5;
        int root = 0;
        int totalElements = unitSize * size;
        
        // 1 process is executed to handle 4 elements
        int sendBuffer[] = new int[totalElements];
        int receiveBuffer[] = new int[unitSize];
        int newReceiveBuffer[] = new int[size];

        // set data for distribution
        if (rank == root) {
            System.out.println("Enter " + totalElements + " elements: \n");
            
            for(int i = 0; i < totalElements; i++) {
                int value = i;
                System.out.println("Element " + i + " = " + value);
                sendBuffer[i] = value;
            }
        }


        // scatter data to processes
        MPI.COMM_WORLD.Scatter(
            sendBuffer, 0, unitSize, MPI.INT, 
            receiveBuffer, 0, unitSize, MPI.INT, 
            root
        );

        // calculate sum at non-root processes
        // store result in 1st index of array
        for(int i = 0; i < unitSize; i++) {
            receiveBuffer[0] += receiveBuffer[i];
        }
        System.out.println("Intermediate Sum At Process " + rank + " is " + receiveBuffer[0]);


        // gather data from processes
        MPI.COMM_WORLD.Gather(
            receiveBuffer, 0, 1, MPI.INT,
            newReceiveBuffer, 0, 1, MPI.INT,
            root
        );

        // aggregate output from all non-root processes
        if(rank == root) {
            int totalSum = 0;
            for(int i = 0; i < size; i++) {
                totalSum += newReceiveBuffer[i];
            }

            System.out.println("Final sum : " + totalSum);
        }

        MPI.Finalize();
    }
}




// export MPJ_HOME=~/Desktop/LP6-DS/mpj-v0_44

// export PATH=$MPJ_HOME/bin:$PATH

// javac -cp $MPJ_HOME/lib/mpj.jar ArrSum.java

/* Specified value of n=4 here */
// $MPJ_HOME/bin/mpjrun.sh -np 4 ArrSum
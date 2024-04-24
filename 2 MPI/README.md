# Steps to execute program

### Step 1: Set Path (give proper path to mpj-v0_44)

    export MPJ_HOME=~/Desktop/LP6-DS/mpj-v0_44

### Step 2: Execute this command

    export PATH=$MPJ_HOME/bin:$PATH

### Step 3: Compile Program
    
    javac -cp $MPJ_HOME/lib/mpj.jar ArrSum.java

### Step 4: Execute Program

Specified value of n=4 here

    $MPJ_HOME/bin/mpjrun.sh -np 4 ArrSum
# Steps to execute program (EASY)

### Step 0: Find the mpj-v0_44 path

command to extract: **tar -xvzf mpj-v0_44.tar.gz**

(you can find it where you have downloaded and extracted the tar.gz file)

- For example: mine is:  `/home/pavi/Desktop/LP6-DS/mpj-v0_44`


# Steps to execute program

### Step 1: Set Path (give proper path to mpj-v0_44) - (change path)

`export MPJ_HOME=<Path>`

    export MPJ_HOME=~/Desktop/LP6-DS/mpj-v0_44

### Step 2: Execute this command (run as it is)

    export PATH=$MPJ_HOME/bin:$PATH

### Step 3: Compile Program (run as it is)
    
    javac -cp $MPJ_HOME/lib/mpj.jar ArrSum.java

### Step 4: Execute Program (run as it is)

Specified value of n=4 here

    $MPJ_HOME/bin/mpjrun.sh -np 4 ArrSum
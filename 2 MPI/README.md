# Steps to execute program (EASY)

### Step 1: Find the mpj-v0_44 path
command to extract: **tar -xvzf mpj-v0_44.tar.gz**

(you can find it where you have downloaded and extracted the tar.gz file)

- For example: mine is:  `/home/pavi/Desktop/LP6-DS/mpj-v0_44`

- See full path to the mpj.jar, for example: `/home/pavi/Desktop/LP6-DS/mpj-v0_44/`**`lib/mpj.jar`**

- And also for mpjrun.sh, for example: `/home/pavi/Desktop/LP6-DS/mpj-v0_44/`**`bin/mpjrun.sh`**

*If you notice, `/home/pavi/Desktop/LP6-DS/mpj-v0_44/` is same for both. and only different file location is appended to the last.*

**Copy this 2 paths** (open a notepad and paste it there to use it later)

### Step 2: Open terminal in your Program folder

### Step 3: Compile the code

- `javac -cp <PATH_COPIED_JAR_PATH> PROGRAM_FILE.java`
- Replace `<PATH_COPIED_JAR_PATH>` with your path and `PROGRAM_FILE` with your Program File Name. eg: `ArrSum.java`

example:  
``` 
    javac -cp /home/pavi/Desktop/LP6-DS/mpj-v0_44/lib/mpj.jar ArrSum.java
```

### Step 4: Execute Program

- `<PATH_COPIED_SH_PATH> PROGRAM_FILE_NAME`
- Replace `<PATH_COPIED_SH_PATH>` with your path and `PROGRAM_FILE_NAME` with your Program File Name. eg: `ArrSum`

Example:

Specified value of n=4 here
```
    /home/pavi/Desktop/LP6-DS/mpj-v0_44/bin/mpjrun.sh -np 4 ArrSum
```


---
---
Above and below, both are steps to execute the code. Choose according to your preference (whichever you find easy) 
---
---
---


# (OLD) Steps to execute program (ANOTHER)

### Step 1: Set Path (give proper path to mpj-v0_44)

`export MPJ_HOME=<Path>`

    export MPJ_HOME=~/Desktop/LP6-DS/mpj-v0_44

### Step 2: Execute this command

    export PATH=$MPJ_HOME/bin:$PATH

### Step 3: Compile Program
    
    javac -cp $MPJ_HOME/lib/mpj.jar ArrSum.java

### Step 4: Execute Program

Specified value of n=4 here

    $MPJ_HOME/bin/mpjrun.sh -np 4 ArrSum
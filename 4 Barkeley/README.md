# Steps To Execute (Ensure you opened terminal in right folder)

## Step 1: Terminal 1

    javac *.java

## Step 2: Terminal 1

ensure filename of your Server Implementation File

    rmic ServerImplementation 

## Step 3: Terminal 1

    rmiregistry

## Step 4: Create Clocks

### Step 4.1: Terminal 2

ensure filename of your Clock file

    java Clock c1 03:25:00

### Step 4.2: Terminal 3

ensure filename of your Clock file

    java Clock c2 03:00:00

### Step 4.3: Terminal 4

ensure filename of your Clock file

    java Clock c3 02:55:00

## Step 5: Terminal 5

ensure filename of your Server

    java Main c1 c2 c3


<hr>

- idk use of `rmic ServerImplementation` (check filename) , but use it after step 1 if you are facing any problem

<hr>
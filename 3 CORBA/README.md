# Steps to execute:

## 1. Execute Server (Terminal 1)

#### Step 1: 

After executing this command, **a new `ReverseModule` folder should be created**

    idlj -fall ReverseModule.idl


#### Step 2:

After executing this command, warnings may come, Then it's OK. BUT 

**Ensure there is no error.**

    javac *.java ReverseModule/*.java

#### Step 3:

After executing this command if the terminal gets stuck, **then hit enter**.

**A new `orb.db` folder should be created**

    orbd -ORBInitialPort 1056&

#### Step 4:

Ensure Proper Filename

`java <ServerFileName> -ORBInitialPort 1056&`

    java Server -ORBInitialPort 1056& 


## 2. Execute Client (Terminal 2)

Ensure Proper Filename

`java <ClientFileName> -ORBInitialPort 1056 -ORBInitialHost localhost`

    java Client -ORBInitialPort 1056 -ORBInitialHost localhost
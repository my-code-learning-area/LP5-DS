# Steps to execute:

## 1. Execute Server (Terminal 1)

#### Step 1: 

    idlj -fall ReverseModule.idl


#### Step 2:

    javac *.java ReverseModule/*.java

#### Step 3:
    
    orbd -ORBInitialPort 1056&

#### Step 4:

`java <ServerFileName> -ORBInitialPort 1056& `

    java Server -ORBInitialPort 1056& 


## 2. Execute Client (Terminal 2)

    java ReverseClient -ORBInitialPort 1056 -ORBInitialHost localhost
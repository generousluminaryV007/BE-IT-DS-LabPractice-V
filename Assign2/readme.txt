Problem Statement:
Develop any distributed application using CORBA to demonstrate object brokering.             
(Calculator or String operations). 


Terminal 1 [Command Prompt]:

[Note: Delete all the ".class" files and "AdditionApp" before compiling or running any commands under Terminal 1]

idlj -fall Addition.idl
javac *.java AdditionApp/*.java
orbd -ORBInitialPort 1050&

Terminal 2 [CP]:

java StartServer -ORBInitialPort 1050 -ORBInitialHost localhost&

Terminal 3 [CP]:

java StartClient -ORBInitialPort 1050 -ORBInitialHost localhost

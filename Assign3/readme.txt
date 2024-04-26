Problem Statement:
Develop a distributed system, to find sum of N elements in an array by distributing N/n elements to n 
number of processors MPI or OpenMP. Demonstrate by displaying the intermediate sums calculated 
at different processors.


[Note: Delete all the ".class" files and "AdditionApp" before compiling the code.]

Setup:

1) Set path using "edit the system environment variables". 
2) Select "Environment Variables"
3) Under "System variables" select "New" and add "Variable name" = MPJ_HOME and "Variable value" = path to the mpj file 

Terminal [Command Prompt]: 

set MPJ_HOME=path to\mpj-v0_44
set PATH=%MPJ_HOME%\bin;%PATH%
javac -cp %MPJ_HOME%\lib\mpj.jar ArrSum.java
%MPJ_HOME%\bin\mpjrun.bat -np 4 ArrSum
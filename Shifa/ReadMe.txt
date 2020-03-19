Below is the code to put in batch file. 


set path=C:\Program Files\Java\jdk1.8.0_111\bin
javac PopulationCheck.java
java PopulationCheck > Output_PopulationCheck.txt


Instructions:

1. open a notepad
2. paste the above code mentioned. 
3. however , you need to ensure you are defining the correct path for variable “path”(First line mentioned in code)pointing for JDK(It resides in Program files under java)
4. once done, saveas .bat file
5. Close and double click
6. the output should be generated in the same folder with file name  Output_Population . 

Please note, you keep the java file in the same folder where you create bat file.

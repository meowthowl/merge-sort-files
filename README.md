# Project description

Test task project Merge Sort Files

## Software requirements

Java 1.8 or higher  
Maven 3.0 or higher
## Required

1. Environment variables:
  ```
%JAVA_HOME% = C:\path\to\jdk
%PATH% = C:\path\to\maven\bin
  ```
2. Executable file has to be in the same folder as input and output files.

3. To start the application use the following instructions below.

## Run parameters

The program parameters are set at startup through command line arguments, in order:
  1. sorting mode (-a or -d), optional (by default sort in ascending order);
  2. data type (-s or -i), mandatory;
  3. output file name, mandatory;
  4. other parameters - names of input files, at least one.

## Run
  
  ```
  MergeSort.exe -i -a out.txt in.txt (for integers in ascending order)
  MergeSort.exe -s out.txt in1.txt in2.txt in3.txt (for strings in ascending order)
  MergeSort.exe -d -s out.txt in1.txt in2.txt (for strings in descending order)
  ```


## Contacts
**Developers:**
**meowthowl**
- **email**: grigoryev.maxim170532@mail.ru

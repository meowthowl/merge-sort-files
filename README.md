# Project description

Test task project Merge Sort Files

## Software requirements

Java 1.8 or higher

## Technology stack
- Java 1.8

- Maven 4

## Required

1. Environment variables:
  ```
%JAVA_HOME% = C:\path\to\jdk
%PATH% = C:\path\to\maven\bin
  ```
2. Executable file has to be in the same folder as input and output files.


## Run [p

The program parameters are set at startup through command line arguments, in order:
  9.1 sorting mode (-a or -d), optional, by default sort in ascending order;
  9.2. data type (-s or -i), mandatory;
  9.3. output file name, mandatory;
  9.4. other parameters - names of input files, at least one.

## Run
  
  ```
  MergeSort.exe -i -a out.txt in.txt (для целых чисел по возрастанию)
  MergeSort.exe -s out.txt in1.txt in2.txt in3.txt (для строк по возрастанию)
  MergeSort.exe -d -s out.txt in1.txt in2.txt (для строк по убыванию)
  ```




## Contacts
**Developers:**

**meowthowl**

- **email**: grigoryev.maxim170532@mail.ru

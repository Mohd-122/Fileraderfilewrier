import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*what is java?
 java is what we call a
 	a) strongly typed
 	b) object oriented
 	c) compiled language that runs on its own virtual machine
 	virtual machine : meaning it runs in a virtual environment in the same way that you can run a linux virtual machine on a windows operating system
 	(but java's virtual machine is naturally much more simple, the JVM)
 	advantage - java can be run anywhere so long as you have the JVM - platform agnostic
 	vm = sandbox
 	in order run, java first needs to be compiled to machine code

 */


public class StorReader {

// main method....is java programming

    public static void main(String[] args) throws IOException, InterruptedException {

/*
 The is file to read and the tools to read it. But the tools are
 Are primitive and currently I d only be able to read single character at time 
What can do we do?
We could example count the amount of characters... count the amount of words or sentences 
Convert to upper/lowercase,replace letters,
 delete while space, only count every other words, and most important send this informations 
 To new file
*/
// if I'm going to solve the count number of character problems ,I need a few things...
//a place where that count is stored
//primitive type: a simple, atomic unit of information - char (characters), boolean(true/false), double (unit with decimals), etc
          int numCharacters = 0;
          boolean  readingFile = true;
//something that reads from file
//object: you can think of as a custom type.. but it has its own states and its behavior

        File MohdFile = new File("Myfile.txt");
        FileReader MohdFileReader = new FileReader(MohdFile);

        while(readingFile) {
            int readByteFromFile = MohdFileReader.read();
            char readCharacterFromByte = (char) readByteFromFile;

            if(readByteFromFile == -1){
                readingFile = false;
            }else{
                //i want to also print out what i have read
                //System.out.println(readByteFromFile + " : " + readCharacterFromByte);
                System.out.print(readCharacterFromByte);
                numCharacters = numCharacters + 1;
                //alternatively, numCharacters++; does the same
            }

        }



  System.out.print('\n'+ ""+ numCharacters);
 

}

}

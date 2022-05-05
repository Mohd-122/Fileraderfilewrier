import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Storywriter {

        public static void main(String[] args) throws IOException {
            File MohdFile = new File("Myfile.txt");
            FileReader MohdFileReader = new FileReader(MohdFile);
//        i want to load characters into some type of memory so that way we can easily manipulate it
//        an array.. (java) this is a fixed length number of some type (could be primitives or objects)
            char[] charArray = new char[10000];
            int numCharacters = 0;
            boolean readingFile = true;

            File fixedFile = new File("fixedFile.txt");
            FileWriter fixedFileWriter = new FileWriter(fixedFile);
            while(readingFile){
                int readByteFromFile = MohdFileReader.read();
                if(readByteFromFile == '_'){
                    readByteFromFile = ' ';
                }
                if(readByteFromFile == -1){
                    readingFile = false;
                }else if(readByteFromFile != -1){
                    charArray[numCharacters] = (char) readByteFromFile;
                    numCharacters++;
                }
            }
            for(int i = 0; i < numCharacters; i++){
//            System.out.print(charArray[i]);
                fixedFileWriter.append(charArray[i]);
            }
            fixedFileWriter.close();
        /*
        is the same as saying something like this:
        int i = 0;
        while(i < charArray.length){
            //do something
          i++
        }
         */
        }


    }




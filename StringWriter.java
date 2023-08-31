
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class StringWriter {

        public static void stringToFile (String string) throws IOException
        {
     
            // attach a file to FileWriter
            FileWriter fw= new FileWriter("output.txt");
     
                fw.write(string);
     
            //close the file
            fw.close();
        }
        
        //add input for file name
        //change output to String
        public static void fileToString (String fileName) throws Throwable
        {
            //File file = new File ("output.txt");
            File file = new File (fileName);
            char ch;
 
             // check if File exists or not
            FileReader fr;
            try
            {
                fr = new FileReader("output.txt");
                while(fr.ready())
                {
                    ch = (char) fr.read();
                    System.out.print(ch);
                }
 
                fr.close();
            } catch (Error | IOException e)
            {
                throw e;
            }
        }
        
        public static int countCharacters (String fileName) throws IOException {
            BufferedReader br = new BufferedReader (new FileReader(fileName));
            int count = 0;
            while (br.ready()) {
                br.read();
                count++;
            }
            return count;
        }
         public static void main (String[] args) throws Throwable
        {
            stringToFile ("Hello \n what is my");
            fileToString("output.txt");
            System.out.println ("" + StringWriter.countCharacters("output.txt"));
        }





}
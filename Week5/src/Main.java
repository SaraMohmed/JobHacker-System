import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try{
        FileReader file = new FileReader("E:\\Lincoln.txt");
        BufferedReader bufferedReader = new BufferedReader(file);
         String line;
         int NumOfWords = 0;

         while ((line = bufferedReader.readLine()) !=null)
         {
          String word [] = line.split(" ");
             NumOfWords += word.length;
         }

         System.out.println("the number of the words inside the file " + NumOfWords );

        }catch(Exception e){System.out.println(e);}


    }
}

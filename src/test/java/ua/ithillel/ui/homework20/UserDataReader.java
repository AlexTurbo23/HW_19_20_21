package ua.ithillel.ui.homework20;

import java.io.*;
public class UserDataReader {
    private BufferedReader br = null;

    private PrintWriter pw = new PrintWriter(System.out, true);
         public void readUserData(String path) throws IOException{
            try{
                br = new BufferedReader(new FileReader(path));
            }
            catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
            String s = null;
            while((s = br.readLine())!=null)
            {
                pw.println(s);
            }
            while((s = br.readLine())!=null);
            br.close();
        }
  }


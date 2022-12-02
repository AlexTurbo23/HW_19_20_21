package ua.ithillel.ui.homework20;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class UserDataSaver {
    public static void saveUserData(String path){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("When you writing 'Exit' your file writing process will be end.");
        System.out.println("Now write 'write' to write a file...");
        try (OutputStream output = Files
                .newOutputStream(
                        Paths.get(path),
                        StandardOpenOption.APPEND,
                        StandardOpenOption.CREATE);
             BufferedOutputStream outputStream = new BufferedOutputStream(output)) {

            String line = "";
            while (!"exit".equalsIgnoreCase(line = reader.readLine())) {
                if ("write".equalsIgnoreCase(line)){
                    outputStream.flush();
                }
                outputStream.write(System.lineSeparator().getBytes());
                outputStream.write(line.getBytes());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

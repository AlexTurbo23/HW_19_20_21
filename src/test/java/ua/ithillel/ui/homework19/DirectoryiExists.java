package ua.ithillel.ui.homework19;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;
import java.io.File;
import java.text.SimpleDateFormat;

public class DirectoryiExists {
    public static void createFileWithDir(String directory,String filename) throws IOException {
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(dir,filename);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public static void main(String[] args) throws IOException {
        String faille = "test_data.yaml";
        String directoryName = "src/main/resources/testdata/";
        createFileWithDir(directoryName,faille);
        File file = new File(directoryName + faille);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Last modified date : " + sdf.format(file.lastModified()));
    }
}


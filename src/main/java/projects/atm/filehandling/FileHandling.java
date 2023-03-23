package projects.atm.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandling {


    public List<String[]> getCSVContents(File userFile, String separator, boolean ignoreFirstLine) {

        ArrayList<String[]> userInfoFile = new ArrayList<>();


        if (userFile != null) {
            try (Scanner scanner = new Scanner(userFile)) {
                while (scanner.hasNextLine()) {
                    userInfoFile.add(scanner.nextLine().split(separator));
                }
            } catch (FileNotFoundException scannerException) {
                System.out.println(scannerException);
            }
            if (ignoreFirstLine) userInfoFile.remove(0);
            return userInfoFile;
        } else return null;
    }


    public File getFile(String filePath) {

        try {
            File input = new File(filePath);
            if (input == null) {
                throw new IllegalArgumentException("File not Found");
            } else {
                return new File(input.toURI());
            }
        } catch (Exception e) {
            return null;
        }
    }
}



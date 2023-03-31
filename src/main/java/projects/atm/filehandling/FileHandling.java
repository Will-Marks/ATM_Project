package projects.atm.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FileHandling {



        public HashMap<String, String> getCSVContents (File userFile, String separator){

//            ArrayList<String[]> userInfoFile = new ArrayList<>();  (Old)
            HashMap<String, String> userInfoFile = new HashMap<>();
            userInfoFile.put("004","Harry");
            if (userFile != null) {
                try (Scanner scanner = new Scanner(userFile)) {
                    while (scanner.hasNextLine()) {
                        userInfoFile.put(scanner.nextLine().split(separator));  //(Old)


// write/research the correct syntax for using Scanner with hashmap. HOMEWORK
                    }
                } catch (FileNotFoundException scannerException) {
                    System.out.println(scannerException);
                }
                return userInfoFile;
            } else return null;
        }




        public File getFile (String filePath){

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



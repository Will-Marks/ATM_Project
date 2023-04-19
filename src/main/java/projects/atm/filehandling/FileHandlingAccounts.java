package projects.atm.filehandling;

import java.io.File;

public class FileHandlingAccounts {

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

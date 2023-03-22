package projects.atm.filehandlingTest;


import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandlingTest {


    public List<String[]> getCSVContents(File userFile, String separator, boolean readFirstLine) {

        ArrayList<String[]> userInfoFile = new ArrayList<>();


        if (userFile != null){
            try (Scanner scanner = new Scanner(userFile)){
                while (scanner.hasNextLine()){
                    userInfoFile.add(scanner.nextLine().split(separator));
                }
            } catch (FileNotFoundException scannerException) {
                System.out.println(scannerException);
            }
            if (readFirstLine) userInfoFile.remove(0);
            return userInfoFile;
        }
        else return null;
    }





    public File getFile(String filePath) {
        try{
            URL resource = getClass().getClassLoader().getResource(filePath);
            if (resource == null){
                throw new IllegalArgumentException("File not Found");
            }else {
                return new File(resource.toURI());
            }
        }
        catch (URISyntaxException e) {
            return null;
        }
    }
}
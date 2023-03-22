package projects.atm.filehandlingTest;


import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class FileHandlingTest {


    public File getFile(String filePath) {
        try{
            URL resource = getClass().getClassLoader().getResource(filePath);
            if (resource == null){
                throw new IllegalArgumentException("File not Found");
            }else {
                return new File(resource.toURI());
            }
        }
        catch (URISyntaxException error) {
            return null;
        }
    }
}
package projects.atm.filehandlingTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReadInTest {

    public List<String[]> getFileContents( String filePath, String separator, boolean readFirstLine) throws FileNotFoundException {

        List<String[]> userInfo = new ArrayList<String[]>();

        try (Scanner scanner = new Scanner(new File(filePath));) {
            while (scanner.hasNextLine()) {
                userInfo.add (scanner.nextLine().split(separator));
            }
        } catch (FileNotFoundException scannerException ){
            System.out.println(scannerException);
        }
        if(readFirstLine) userInfo.remove(0);

        return userInfo;
    }
}

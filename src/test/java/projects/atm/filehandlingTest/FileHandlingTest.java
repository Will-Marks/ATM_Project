package projects.atm.filehandlingTest;


import org.junit.Test;
import projects.atm.filehandling.FileHandling;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FileHandlingTest {

    @Test
    public void testFileReadUserInfo() {

        FileHandling filehandler = new FileHandling();
        File userFile = filehandler.getFile("data/UserInfo.txt");
        List<String[]> users = filehandler.getCSVContents(userFile, ",", true);
        for (String[] x : users) {
            System.out.println(Arrays.toString(x));


            assertEquals("John", users.get(0)[0]);
            assertNotEquals("Leanne", users.get(0)[0]);
        }
    }
}
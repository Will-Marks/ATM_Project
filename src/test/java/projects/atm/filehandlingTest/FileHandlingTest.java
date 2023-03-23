package projects.atm.filehandlingTest;


import org.junit.Test;
import projects.atm.filehandling.FileHandling;

import java.io.File;
import java.util.List;

public class FileHandlingTest {

    @Test
    public void testFileReadUserInfo() {

        FileHandling filehandler = new FileHandling();
        File userFile = filehandler.getFile("data/UserInfo.txt");
        List<String[]> users = filehandler.getCSVContents(userFile, ",", false);
        for (String[] x: users) {
            System.out.println(x);

        }
//        assertTrue(users.get(0)[0].equals("John"));
//        assertFalse(users.get(0)[0].equals("Leanne"));
    }
}
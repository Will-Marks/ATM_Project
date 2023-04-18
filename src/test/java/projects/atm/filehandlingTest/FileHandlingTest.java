package projects.atm.filehandlingTest;


import org.junit.Test;
import projects.atm.filehandling.FileHandling;
import projects.atm.users.User;

import java.io.File;
import java.util.HashMap;

public class FileHandlingTest {

    @Test
    public void testFileReadUserInfo() {

        FileHandling filehandler = new FileHandling();
        File userFile = filehandler.getFile("data/UserInfo.txt");
        HashMap<String, User> users = filehandler.getCSVContents(userFile, ",");
//        for (String[] x : users) {
//            System.out.println(Arrays.toString(x));
        System.out.println(users.get("001").getAccountOwnerID());


//            assertEquals("John", users.get(1)[0]);
//            assertNotEquals("Leanne", users.get(1)[0]);
//            assertEquals("Kim", users.get(2)[0]);
//        }
    }
}
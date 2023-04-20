package projects.atm.filehandlingTest;

import org.junit.Test;
import projects.atm.filehandling.FileHandlingUsers;
import projects.atm.users.User;

import java.io.File;
import java.util.HashMap;

public class FileHandlingUsersTest {

    @Test
    public void testFileReadUserInfo() {

        FileHandlingUsers filehandler = new FileHandlingUsers();
        File userFile = filehandler.getFile("data/UserInfo.txt");
        HashMap<String, User> users = filehandler.getCSVContents(userFile, ",");
//        for (String[] x : users) {
//            System.out.println(Arrays.toString(x));
        System.out.println(users.get("001").getFirstName());


//            assertEquals("John", users.get(1)[0]);
//            assertNotEquals("Leanne", users.get(1)[0]);
//            assertEquals("Kim", users.get(2)[0]);
//        }
    }
}
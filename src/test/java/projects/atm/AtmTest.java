package projects.atm;


import projects.atm.filehandlingTest.FileHandlingTest;

import java.io.File;
import java.util.List;

public class AtmTest {

    public static void main(String[] args) {

        FileHandlingTest fileHandlingTest = new FileHandlingTest();
        File userFile = fileHandlingTest.getFile("UserInfo.txt");
        List<String[]> userInfoFile = fileHandlingTest.getCSVContents(userFile, ",", false);

    }

    }










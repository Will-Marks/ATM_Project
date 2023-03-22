package projects.atm;


import projects.atm.filehandlingTest.FileHandlingTest;

import java.io.File;

public class AtmTest {

    public static void main(String[] args) {

        FileHandlingTest fileHandlingTest = new FileHandlingTest();
        File userInfoFile = fileHandlingTest.getFile("UserInfo.txt");

    }

    }










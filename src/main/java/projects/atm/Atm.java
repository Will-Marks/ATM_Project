package projects.atm;


import projects.atm.filehandling.FileHandling;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Atm {
    public static void main(String[] args) {

        FileHandling filehandler = new FileHandling();

        File userFile = filehandler.getFile("data/UserInfo.txt");
        List<String[]> users = filehandler.getCSVContents(userFile, ",", false);
        for (String[] x : users) {
            System.out.println(Arrays.toString(x));


        }
    }

    }




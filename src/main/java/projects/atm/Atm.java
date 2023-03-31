package projects.atm;


import projects.atm.filehandling.FileHandling;

import java.io.File;
import java.util.HashMap;

public class Atm {
    public static void main(String[] args) {


        FileHandling filehandler = new FileHandling();

        File userFile = filehandler.getFile("data/UserInfo.txt");
        HashMap<String, String> users = filehandler.getCSVContents(userFile, ",");
//        for (HashMap<String, String> x : users) {
//            System.out.println(Arrays.toString(x));
        System.out.println(users);


        }
    }

//    }




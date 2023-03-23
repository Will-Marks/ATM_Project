package projects.atm;


import projects.atm.filehandling.FileHandling;

import java.io.File;
import java.util.List;

public class Atm
{
    public static void main( String[] args )
    {

        FileHandling fileHandling = new FileHandling();
        File userFile = FileHandling.getFile("/Users/williammarks/Documents/JavaClasses/atm_project/data/UserInfo.txt");
        List<String[]> userInfoFile = fileHandling.getCSVContents(userFile, ",", false);



    }


    }


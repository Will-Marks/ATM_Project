package projects.atm;


import projects.atm.filehandling.FileHandling;
import projects.atm.users.User;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {


        FileHandling filehandler = new FileHandling();

        File userFile = filehandler.getFile("data/UserInfo.txt");
        HashMap<String, User> users = filehandler.getCSVContents(userFile, ",");
//        for (HashMap<String, String> x : users) {
//            System.out.println(Arrays.toString(x));
//        System.out.println(users.get("001").getSurname());


            System.out.println("Please enter your User ID:");
            Scanner userIdCheck = new Scanner(System.in);
            String userId = userIdCheck.nextLine();


            if (users.containsKey(userId)) {
                System.out.println("Welcome " + users.get(userId).getFirstName() + " " + users.get(userId).getSurname());
            } else {
                System.out.println("Incorrect, please try again.");
            }


    }
}







////        if (!userIdCheck.hasNext("001")) {
//            if (userIdCheck. {
//            System.out.println("Incorrect, try again");
//        } else {
//            System.out.println("Correct!");
//        }
//
//
//
//

//        if(userIdCheck.nextLine(users.containsKey())){
//            System.out.println("nice");






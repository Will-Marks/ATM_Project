package projects.atm;


import projects.atm.accounts.Account;
import projects.atm.filehandling.FileHandlingAccounts;
import projects.atm.filehandling.FileHandlingUsers;
import projects.atm.users.User;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {


        FileHandlingUsers userfilehandler = new FileHandlingUsers();

        File userFile = userfilehandler.getFile("data/UserInfo.txt");
        HashMap<String, User> users = userfilehandler.getCSVContents(userFile, ",");
//        for (HashMap<String, String> x : users) {
//            System.out.println(Arrays.toString(x));
//        System.out.println(users.get("001").getSurname());

        FileHandlingAccounts accountfilehandler = new FileHandlingAccounts();

        File accountFile = accountfilehandler.getAccountFile("data/OpeningAccountsData.txt");
        HashMap<String, Account> accounts = accountfilehandler.getFileContents(accountFile, "|||");

        System.out.println(accounts.get("002").getAccountNumber());


        System.out.println(users.get("001").getSurname());



        boolean isValidUser  = false;
        while (!isValidUser) {
            System.out.println("Please enter your User ID:");
            Scanner userIdCheck = new Scanner(System.in);
            String userId = userIdCheck.nextLine();

            if (users.containsKey(userId)) {
                isValidUser = true;
                System.out.println("Welcome " + users.get(userId).getFirstName() + " " + users.get(userId).getSurname());
            } else {System.out.println("Incorrect User ID");

            }
        } // end while loop

        System.out.println("Please select an option:"
                + "\n- 1 for Deposit"
                + "\n- 2 for Withdraw"
                + "\n- 3 for Balance"
                + "\n- q to Quit ");

        Scanner optionSelection = new Scanner(System.in);
        String optionChoice = optionSelection.nextLine();







    }
}


//            if (users.containsKey(userId)) {
//                System.out.println("Welcome " + users.get(userId).getFirstName() + " " + users.get(userId).getSurname());
//            } else {
//                System.out.println("Incorrect, please try again.");
//            }












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






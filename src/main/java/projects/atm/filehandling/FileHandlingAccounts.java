package projects.atm.filehandling;

import projects.atm.accounts.Account;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FileHandlingAccounts {



    public HashMap<String, Account> getFileContents(File userAccount, String separator) {

//
        HashMap<String, Account> userAccountFile = new HashMap<>();


        if (userAccount != null) {

            try (Scanner scanner = new Scanner(userAccount)) {
                while (scanner.hasNextLine()) {

                    addAccount(separator, userAccountFile, scanner);
                }
            } catch (FileNotFoundException scannerException) {
                System.out.println(scannerException);
            }
            return userAccountFile;
        } else return null;
    }

    private static void addAccount(String separator, HashMap<String, Account> userAccountFile, Scanner scanner) {
        String[] record = scanner.nextLine().split(separator);

        Account newAccount = new Account(record[0], record[1], record[2], record[3]);
        userAccountFile.put(newAccount.getAccountOwnerID(), newAccount);
    }

        public File getAccountFile (String filePath){

            try {
                File input = new File(filePath);
                if (input == null) {
                    throw new IllegalArgumentException("File not Found");
                } else {
                    return new File(input.toURI());
                }
            } catch (Exception e) {
                return null;
            }
        }


    }


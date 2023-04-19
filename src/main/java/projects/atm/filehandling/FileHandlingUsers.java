package projects.atm.filehandling;

import projects.atm.users.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FileHandlingUsers {



        public HashMap<String, User> getCSVContents (File userFile, String separator){

//            ArrayList<String[]> userInfoFile = new ArrayList<>();  (Old)
            HashMap<String, User> userInfoFile = new HashMap<>();
            //userInfoFile.put("001",new User("John","Smith","0403715629","001"));

            if (userFile != null) {

                try (Scanner scanner = new Scanner(userFile)) {
                    while (scanner.hasNextLine()) {
                        //userInfoFile.put(scanner.nextLine().split(separator));  //(Old)
                        addUser(separator, userInfoFile, scanner);
                        //userInfoFile.containsKey("001")


// write/research the correct syntax for using Scanner with hashmap. HOMEWORK
                    }
                } catch (FileNotFoundException scannerException) {
                    System.out.println(scannerException);
                }
                return userInfoFile;
            } else return null;
        }

    private static void addUser(String separator, HashMap<String, User> userInfoFile, Scanner scanner) {
        String[] record = scanner.nextLine().split(separator);

        User newUser = new User(record[0], record[1], record[2], record[3]);
        userInfoFile.put(newUser.getAccountOwnerID(), newUser);
    }


    public File getFile (String filePath){

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



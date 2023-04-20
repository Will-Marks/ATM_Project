package projects.atm.filehandlingTest;

import org.junit.Test;
import projects.atm.accounts.Account;
import projects.atm.filehandling.FileHandlingAccounts;

import java.io.File;
import java.util.HashMap;

public class FileHandlingAccountsTest {

    @Test
    public void testFileReadAccountInfo(){

        FileHandlingAccounts accountfilehandler = new FileHandlingAccounts();
        File accountFile = accountfilehandler.getAccountFile("data/OpeningAccountsData.txt");
        HashMap<String, Account> accounts = accountfilehandler.getFileContents(accountFile, "|||");


        System.out.println(accounts.get("001").getOpeningBalance());

    }



}

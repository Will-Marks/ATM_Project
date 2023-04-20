package projects.atm.accounts;

public class Account {

    String AccountOwnerID;
    String AccountNumber;
    String AccountType;
    String OpeningBalance;

    public Account (String accountOwnerID, String accountNumber, String accountType, String openingBalance) {
        AccountOwnerID = accountOwnerID;
        AccountNumber = accountNumber;
        AccountType = accountType;
        OpeningBalance = openingBalance;
    }

    public String getAccountOwnerID(){
        return AccountOwnerID;
    }

    public void setAccountOwnerID (String accountOwnerID ){
        AccountOwnerID = accountOwnerID;
    }


    public String getAccountNumber(){
        return AccountNumber;
    }

    public void setAccountNumber (String accountNumber ){
        AccountOwnerID = accountNumber;
    }

    public String getAccountType(){
        return AccountType;
    }

    public void setAccountType (String accountType ){
        AccountType = accountType;
    }


    public String getOpeningBalance(){
        return OpeningBalance;
    }

    public void setOpeningBalance (String openingBalance ){
        OpeningBalance = openingBalance;
    }
}

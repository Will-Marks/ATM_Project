package projects.atm.users;

public class User {

    String FirstName;
    String Surname;
    String Mobile;
    String AccountOwnerID;

    public User(String firstName, String surname, String mobile, String accountOwnerID) {
        FirstName = firstName;
        Surname = surname;
        Mobile = mobile;
        AccountOwnerID = accountOwnerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getAccountOwnerID() {
        return AccountOwnerID;
    }

    public void setAccountOwnerID(String accountOwnerID) {
        AccountOwnerID = accountOwnerID;
    }
}










package dto;

public class UserDto {
    private String userID;
    private String userName;
    private String userTitle;
    private String userDOB;
    private String userAddress;
    private String userContact;

    public UserDto(){
        
    }
    
    public UserDto(String userID, String userName, String userTitle, String userDOB, String userAddress,
            String userContact) {
        this.userID = userID;
        this.userName = userName;
        this.userTitle = userTitle;
        this.userDOB = userDOB;
        this.userAddress = userAddress;
        this.userContact = userContact;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    @Override
    public String toString() {
        return "UserDto [userID=" + userID + ", userName=" + userName + ", userTitle=" + userTitle + ", userDOB="
                + userDOB + ", userAddress=" + userAddress + ", userContact=" + userContact + "]";
    }

    

    
}

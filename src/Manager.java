public class Manager {
    String account;
    String password;
    String ID;
    public Manager(String account, String password, String ID) {
        this.account = account;
        this.password = password;
        this.ID = ID;
    }
    public String getAccount() {
        return account;
    }
    public String getPassword() {
        return password;
    }
    public String getID() {
        return ID;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
}

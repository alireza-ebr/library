public class Admin {
    private String username;
    private String password;

    public Admin(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public String getName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.username = name;
    }

    public boolean iden(String password) {
        return this.password.equals(password);
    }
}

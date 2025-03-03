
public class User {
    private String name;
    private String address;
    private int age;
    private String gender;
    private String password;
    private int id;

    public User(String name, String address, int age, String gender, String password, int id) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name :"+name+"\n address :"+address+"\n age :"+age+"\n gender :"+gender+"\n password :"+password;
    }
}


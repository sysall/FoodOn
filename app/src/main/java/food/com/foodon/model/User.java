package food.com.foodon.model;

public class User {
    private String Grade;
    private String Name;
    private String Password;
    private String Phone;

    public User() {
    }

    public User(String grade, String name, String password, String phone) {
        Grade = grade;
        Name = name;
        Password = password;
        Phone = phone;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}

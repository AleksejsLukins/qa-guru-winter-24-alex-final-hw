package model;

public class Student {
    // ATTRIBUTES
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean male;

    // GETTERS/SETTERS(ALT+INSERT)(CODE->GENERATE)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}

//домашка - типы данных выучить, создать 5 любых объектов,
// в каждом из них должно быть по 5 аттрибутов, и для каждого геттеры и сеттеры.
// домашку сдавать скриншотами - объекты(5) и 6ой - структура объектов.
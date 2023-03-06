package task_6_4_1.varvara;

public class Person {
    private String name;
    private String lastName;
    private String phoneNumber;

    public Person(String name, String surname, String phoneNumber) {
        this.name = name;
        this.lastName = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person personObj = (Person) obj;
        if (personObj.getName().equals(this.name)
                && personObj.getLastName().equals(this.lastName)
                && personObj.getPhoneNumber().equals(this.phoneNumber)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        String classString = "Имя :"+ this.name + " Фамилия " + this.lastName + " Номер телефона " + this.phoneNumber;
        return classString;
    }
}

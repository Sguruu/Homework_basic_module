package task_6_4_1.alex;

import stream.st_6.equals.Person_st_6;

public class Person {
    private String name;
    private String lastName;
    private String numberPhone;

    public Person(String name, String lastName, String numberPhone) {
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;

        if (this.getClass() != obj.getClass())
            return false;

        Person currentObj = (Person) obj;

        if (this.name.equals(currentObj.name)
                && this.lastName.equals(currentObj.lastName)
        ) {
            return true;
        } else {
            return false;
        }
    }
}

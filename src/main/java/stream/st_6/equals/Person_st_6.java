package stream.st_6.equals;

public class Person_st_6 {
    private String name;
    private int age;

    public Person_st_6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;

        if (this.getClass() != obj.getClass())
            return false;

        Person_st_6 currentObj = (Person_st_6) obj;

        if (this.name.equals(currentObj.name)
                && this.age == currentObj.age
        ) {
            return true;
        } else {
            return false;
        }
    }
}

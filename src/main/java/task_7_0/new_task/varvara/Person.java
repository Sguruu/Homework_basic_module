package task_7_0.new_task.varvara;

public class Person {
    private String name;
    private String lastName;
    private int age;
    Gender gender;

    Person(String name, String lastName, Gender gender, int age) {
        setName(name);
        setLastName(lastName);
        setGender(gender);
        setAge(age);
    }

    public void setAge(int age) {
        try {
            if (age < 0 || age > 110) {
                throw new Exception("Ошибка. Укажите верный возраст");
            } else {
                this.age = age;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void hello() {
        System.out.println("Привет, меня зовут" + " " + name + " " + lastName + ", мне " + " " + age + " " + " лет ");
    }
}

package task_7_0.new_task.valera.human;

public class HumanValera {
    private String name;
    private String surname;
    private byte age;
    private Sex sex;

    public HumanValera(String name, String surname, byte age, Sex sex) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        try {
            if (age < 0 || age > 110) {
                throw new Exception("Ошибка. Возраст может быть в диаппазоне от 0 до 110 лет.");
            } else {
                this.age = age;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void introduceYourself() {
        System.out.println("Здравствуйте, меня зовут " + name + " " + surname + ". Я " + sex.getRussianSex() + ", мне " + age + " лет.");
    }
}


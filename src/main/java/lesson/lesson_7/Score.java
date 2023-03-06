package lesson.lesson_7;

// Класс магазин
public class Score {
    PersonProfession employee;  // сотрудник
    Product product; // товар
}

class Product {
    private String name; // название товара
    private int amount; // количетсво
    private int price; // стоимость товара

    public Product(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
}



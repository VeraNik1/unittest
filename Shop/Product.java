package seminars.first.Shop;

public class Product {
    private Double cost; // Стоимость продукта
    private String title; // Название

    public Product(String title, Double cost) {
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
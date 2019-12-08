package model;

public class Product extends Publisher {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void changePrice(double price) {
        this.price = price;
        this.sendNotify();
    }

    public void addStock(int amount) {
        this.stock += amount;
        this.sendNotify();
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }
}

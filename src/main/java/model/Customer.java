package model;

public class Customer extends Subscriber {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(Publisher publisher) {
        if (publisher.getClass() == Product.class) {
            this.viewSubscribedProduct((Product) publisher);
        }
    }

    void viewSubscribedProduct(Product product) {
        System.out.println(String.format("customer: %s know product '%s' changed.", this.name, product.getName()));
    }
}

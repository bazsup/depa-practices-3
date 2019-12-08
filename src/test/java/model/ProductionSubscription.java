package model;

import org.junit.Test;

public class ProductionSubscription {

    @Test
    public void test_customer_was_triggered_to_view_product() {
        Product product = new Product("Apple iPhone 11", 20, 10);
        Customer customer = new Customer("Bas");
        customer.interestIn(product);
        product.changePrice(10);
    }
}

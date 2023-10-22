package seminars.first.Shop;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    Shop shop;


    public void setUp() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("lamp", 250.0));
        products.add(new Product("door", 400.0));
        products.add(new Product("ball", 120.0));
        shop = new Shop(products);
    }



    @Test
    public void testGetProducts() {
        setUp();
        assertEquals(3, shop.getProducts().size());
        assertEquals("lamp", shop.getProducts().get(0).getTitle());
        assertEquals(250.0, shop.getProducts().get(0).getCost(), 0.001);
        assertEquals("door", shop.getProducts().get(1).getTitle());
        assertEquals(400.0, shop.getProducts().get(1).getCost(), 0.001);
        assertEquals("ball", shop.getProducts().get(2).getTitle());
        assertEquals(120.0, shop.getProducts().get(2).getCost(), 0.001);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        setUp();
        assertEquals("door", shop.getMostExpensiveProduct().getTitle());
        assertEquals(400.0, shop.getMostExpensiveProduct().getCost(), 0.001);
    }

    @Test
    public void testSortProductsByPrice() {
        setUp();
        shop.sortProductsByPrice();
        assertEquals("ball", shop.getProducts().get(0).getTitle());
        assertEquals("lamp", shop.getProducts().get(1).getTitle());
        assertEquals("door", shop.getProducts().get(2).getTitle());
    }

}
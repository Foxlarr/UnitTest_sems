package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();

        Product productA = new Product();
        productA.setCost(50);
        productA.setTitle("Product A");

        Product productB = new Product();
        productB.setCost(30);
        productB.setTitle("Product B");

        Product productC = new Product();
        productC.setCost(70);
        productC.setTitle("Product C");

        products.add(productA);
        products.add(productB);
        products.add(productC);

        shop.setProducts(products);
        List<Product> sortedProducts = shop.sortProductsByPrice();

        // Проверяем, что sortedProducts содержит продукты в правильном порядке
        assert sortedProducts.get(0).getCost() == 30;
        assert sortedProducts.get(1).getCost() == 50;
        assert sortedProducts.get(2).getCost() == 70;

        // Выводим сообщение об успешном выполнении теста
        System.out.println("testSortProductsByPrice passed");
    }

    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();

        Product productA = new Product();
        productA.setCost(50);
        productA.setTitle("Product A");

        Product productB = new Product();
        productB.setCost(30);
        productB.setTitle("Product B");

        Product productC = new Product();
        productC.setCost(70);
        productC.setTitle("Product C");

        products.add(productA);
        products.add(productB);
        products.add(productC);

        shop.setProducts(products);
        Product mostExpensive = shop.getMostExpensiveProduct();

        // Проверяем, что mostExpensive равен самому дорогому продукту
        assert mostExpensive.getCost() == 70;
    }


    public static void main(String[] args) {
        ShopTest shopTest = new ShopTest();
        shopTest.testSortProductsByPrice();
        shopTest.testGetMostExpensiveProduct();
    }
}

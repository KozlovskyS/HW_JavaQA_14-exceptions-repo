package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {
    ShopRepository repo= new ShopRepository();
    Product product1 = new Product(11, "продукт 1", 25);
    Product product2 = new Product(22, "продукт 2", 123);
    Product product3 = new Product(33, "продукт 3", 1_000)

    @Test
    public void testFindAll() {
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindById() {
    }

    @Test
    public void testRemoveByID() {
    }
}
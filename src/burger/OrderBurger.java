package burger;

import burger.product.Product;
import burger.product.ProductRepository;

public class OrderBurger {

    public void run() {
        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getProducts();
        Menu menu = new Menu(products);

        System.out.println("🍔 햄버거 주문 프로그램");
    }
}

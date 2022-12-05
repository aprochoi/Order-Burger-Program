package burger;

import burger.product.Product;
import burger.product.ProductRepository;

import java.util.Scanner;

public class OrderBurger {

    public void run() {
        Scanner sc = new Scanner(System.in);
        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getProducts();
        Menu menu = new Menu(products);

        System.out.println("🍔 햄버거 주문 프로그램");
        menu.showMenu();
        String choice = sc.nextLine();
    }
}

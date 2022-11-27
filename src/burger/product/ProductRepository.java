package burger.product;

import burger.product.detailproduct.Drink;
import burger.product.detailproduct.Hamburger;
import burger.product.detailproduct.Side;

public class ProductRepository {
    private final Product[] products = {
            new Hamburger(1, "불고기버거", 4000, 500, false, 5000),
            new Hamburger(2, "치즈버거", 3500, 600, false, 4500),
            new Side(3, "감자튀김", 1000, 300, 1),
            new Side(4, "치즈스틱", 1000, 300, 1),
            new Drink(5, "콜라", 1000, 200, true),
            new Drink(6, "사이다", 1000, 200, true),
            new Drink(7, "제로콜라", 1000, 0, true)
    };

    public Product[] getProducts() {
        return products;
    }
}

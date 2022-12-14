package burger;

import burger.product.Product;
import burger.product.detailproduct.Drink;
import burger.product.detailproduct.Hamburger;
import burger.product.detailproduct.HamburgerSet;
import burger.product.detailproduct.Side;

import java.util.Scanner;

public class Cart {
    private Product[] products = new Product[0];
    Scanner sc = new Scanner(System.in);

    public void showCart() {
        System.out.println("๐งบ ์ฅ๋ฐ๊ตฌ๋");
        System.out.println("-".repeat(50));

        showCartProducts();

        System.out.println("-".repeat(50));
        System.out.printf("ํฉ๊ณ : %s์\n", 10);

        System.out.println("์ด์ ์ผ๋ก ๋์๊ฐ๋ ค๋ฉด ์ํฐ๋ฅผ ๋๋ฅด์ธ์.");
        sc.nextLine();
    }

    private void showCartProducts() {
        for (Product product : products) {
            if (product instanceof HamburgerSet) {
                HamburgerSet hamburgerSet = (HamburgerSet) product;
                System.out.printf(" %s %s์ (%s(์ผ์ฒฉ %s๊ฐ), %s(๋นจ๋ %s))\n",
                        product.getName(), product.getPrice(),
                        hamburgerSet.getSide().getName(),
                        hamburgerSet.getSide().getKetchup(),
                        hamburgerSet.getDrink().getName(),
                        hamburgerSet.getDrink().isStraw() ? "์์" : "์์");
            }
            else if(product instanceof Hamburger) {
                System.out.printf(" %s %s์ (๋จํ)\n", product.getName(), product.getPrice());
            }
            else if(product instanceof Side) {
                System.out.printf(" %s %s์ (์ผ์ฒฉ %s๊ฐ)\n",
                        product.getName(), product.getPrice(), ((Side) product).getKetchup());
            }
            else if(product instanceof Drink) {
                System.out.printf(" %s %s์ (๋นจ๋ %s)\n",
                        product.getName(), product.getPrice(), ((Drink) product).isStraw() ? "์์" : "์์");
            }
        }
    }
}

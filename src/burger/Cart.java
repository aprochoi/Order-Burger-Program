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
        System.out.println("🧺 장바구니");
        System.out.println("-".repeat(50));

        showCartProducts();

        System.out.println("-".repeat(50));
        System.out.printf("합계 : %s원\n", 10);

        System.out.println("이전으로 돌아가려면 엔터를 누르세요.");
        sc.nextLine();
    }

    private void showCartProducts() {
        for (Product product : products) {
            if (product instanceof HamburgerSet) {
                HamburgerSet hamburgerSet = (HamburgerSet) product;
                System.out.printf(" %s %s원 (%s(케첩 %s개), %s(빨대 %s))\n",
                        product.getName(), product.getPrice(),
                        hamburgerSet.getSide().getName(),
                        hamburgerSet.getSide().getKetchup(),
                        hamburgerSet.getDrink().getName(),
                        hamburgerSet.getDrink().isStraw() ? "있음" : "없음");
            }
            else if(product instanceof Hamburger) {
                System.out.printf(" %s %s원 (단품)\n", product.getName(), product.getPrice());
            }
            else if(product instanceof Side) {
                System.out.printf(" %s %s원 (케첩 %s개)\n",
                        product.getName(), product.getPrice(), ((Side) product).getKetchup());
            }
            else if(product instanceof Drink) {
                System.out.printf(" %s %s원 (빨대 %s)\n",
                        product.getName(), product.getPrice(), ((Drink) product).isStraw() ? "있음" : "없음");
            }
        }
    }
}

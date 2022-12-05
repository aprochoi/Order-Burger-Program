package burger;

import burger.product.Product;
import burger.product.detailproduct.Drink;
import burger.product.detailproduct.Hamburger;
import burger.product.detailproduct.Side;

public class Menu {
    private Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void showMenu() {
        System.out.println("[ 🔻 ] 메뉴");
        System.out.println("-".repeat(50));

        showHamburgers();
        showSides();
        showDrinks();

        System.out.println();
        System.out.println("🧺 (0) 장바구니");
        System.out.println("🛒 (+) 주문하기");
        System.out.println("-".repeat(50));
        System.out.println("[안내] 메뉴를 선택하세요 : ");
    }

    private void showDrinks() {
        System.out.println("🥤 음료수");
        for (Product product : products) {
            if(product instanceof Drink) {
                printMenu(product);
            }
        }
        System.out.println();
    }

    private void showSides() {
        System.out.println("🍟 사이드");
        for (Product product : products) {
            if (product instanceof Side) {
                printMenu(product);
            }
        }
        System.out.println();
    }

    private void showHamburgers() {
        System.out.println("🍔 햄버거");
        for (Product product : products) {
            if(product instanceof Hamburger) {
                printMenu(product);
            }
        }
        System.out.println();
    }

    private void printMenu(Product product) {
        System.out.printf(" (%d) %s %sKcal %s원\n",
                product.getId(), product.getName(), product.getKcal(), product.getPrice());
    }
}

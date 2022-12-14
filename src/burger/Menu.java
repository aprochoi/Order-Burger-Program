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
        System.out.println("[ π» ] λ©λ΄");
        System.out.println("-".repeat(50));

        showHamburgers();
        showSides();
        showDrinks();

        System.out.println();
        System.out.println("π§Ί (0) μ₯λ°κ΅¬λ");
        System.out.println("π (+) μ£Όλ¬ΈνκΈ°");
        System.out.println("-".repeat(50));
        System.out.print("[μλ΄] λ©λ΄λ₯Ό μ ννμΈμ : ");
    }

    private void showDrinks() {
        System.out.println("π₯€ μλ£μ");
        for (Product product : products) {
            if(product instanceof Drink) {
                printMenu(product);
            }
        }
        System.out.println();
    }

    private void showSides() {
        System.out.println("π μ¬μ΄λ");
        for (Product product : products) {
            if (product instanceof Side) {
                printMenu(product);
            }
        }
        System.out.println();
    }

    private void showHamburgers() {
        System.out.println("π νλ²κ±°");
        for (Product product : products) {
            if(product instanceof Hamburger) {
                printMenu(product);
            }
        }
        System.out.println();
    }

    private void printMenu(Product product) {
        System.out.printf(" (%d) %s %sKcal %sμ\n",
                product.getId(), product.getName(), product.getKcal(), product.getPrice());
    }
}

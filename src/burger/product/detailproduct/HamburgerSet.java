package burger.product.detailproduct;

import burger.product.Product;

public class HamburgerSet extends Product {
    private Hamburger hamburger;
    private Side side;
    private Drink drink;

    public HamburgerSet(int id, String name, int price, int kcal, Hamburger hamburger, Side side, Drink drink) {
        super(id, name, price, kcal);
        this.hamburger = hamburger;
        this.side = side;
        this.drink = drink;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Side getSide() {
        return side;
    }

    public Drink getDrink() {
        return drink;
    }
}

package burger.product.detailproduct;

import burger.product.Product;

public class Drink extends Product {
    private boolean straw;

    public Drink(int id, String name, int price, int kcal, boolean straw) {
        super(id, name, price, kcal);
        this.straw = straw;
    }

    public boolean isStraw() {
        return straw;
    }

    public void setStraw(boolean straw) {
        this.straw = straw;
    }
}

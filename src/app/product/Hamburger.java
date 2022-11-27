package app.product;

public class Hamburger extends Product{
    private boolean isSet;
    private int burgerSetPrice;

    public Hamburger(int id, String name, int price, int kcal, boolean isSet, int burgerSetPrice) {
        super(id, name, price, kcal);
        this.isSet = isSet;
        this.burgerSetPrice = burgerSetPrice;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setSet(boolean set) {
        isSet = set;
    }

    public int getBurgerSetPrice() {
        return burgerSetPrice;
    }

    public void setBurgerSetPrice(int burgerSetPrice) {
        this.burgerSetPrice = burgerSetPrice;
    }
}

public class Menu {

    private int hotmeals;
    private int appetizer;
    private int drinks;

    public int getHotmeals() {
        return hotmeals;
    }

    public void setHotmeals(int hotmeals) {
        this.hotmeals = hotmeals;
    }

    public int getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(int appetizer) {
        this.appetizer = appetizer;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    public  Menu (int hotmeals, int appetizer, int drinks) {
        this.hotmeals = hotmeals;
        this.appetizer = appetizer;
        this.drinks = drinks;
    }
}

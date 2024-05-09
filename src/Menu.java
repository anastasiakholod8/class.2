public class Menu {
    private String hotmeals;
    private String appetizer;
    private String drinks;

    public String getHotmeals() {
        return hotmeals;
    }

    public void setHotmeals(String hotmeals) {
        this.hotmeals = hotmeals;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public Menu(String hotmeals, String appetizer, String drinks) {
        this.hotmeals = hotmeals;
        this.appetizer = appetizer;
        this.drinks = drinks;

    }
    String orderCustomer;

    String getOrder(String customer) {
        if (customer == "notallergy") {
            orderCustomer="  може їсти усі страви" ;

        } else if (customer == " hasallergy") {
            orderCustomer=" не може їсти усі страви";

        } else orderCustomer="Не їсть нічого" ;{

        }
        return customer;
    }
    void printWhichMenu(){
        System.out.println("Відвідувач" + " - " + orderCustomer);
    }
}













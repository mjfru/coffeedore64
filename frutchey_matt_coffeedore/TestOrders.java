import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("Latte", 3.50);
        coffeeKiosk.addMenuItem("Bagel", 1.50);
        coffeeKiosk.addMenuItem("Iced Tea", 2.50);
        coffeeKiosk.addMenuItem("Iced Coffee", 2.50);

        coffeeKiosk.newOrder();
    };
}
import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // Constructor
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // Methods

    // Add item to order
    public void addItem(Item item) {
        items.add(item);
    }

    // Check order status:
    public String orderStatus() {
        if(this.ready) {
            return ("Your order is ready!");
        } else {
            return ("Thank you for waiting. Your order will be ready soon.");
        }
    }

    // Get total
    public double getOrderTotal() {
        double orderTotal = 0;
        for(int i = 0; i < items.size(); i++) {
            orderTotal += items.get(i).getPrice();
        }
        return orderTotal;
    }

    // Display order
    public void displayOrder() {
        System.out.println("Customer name: " + this.name);
        for(int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println("Item: " + item.getName() + " || " + "$" + item.getPrice());
        }
        System.out.println("Your Total: $" + getOrderTotal());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // Getters
    public String getCustomerName() {
        return this.name;
    }

    public boolean getOrderReady() {
        return this.ready;
    }

    public ArrayList<Item> getOrder() {
        return this.items;
    }

    // Setters
    public void setCustomerName(String name) {
        this.name = name;
    }

    public void setOrderReady(boolean ready) {
        this.ready = ready;
    }

    public void setOrderItems(ArrayList<Item> items) {
        this.items = items;
    }
}
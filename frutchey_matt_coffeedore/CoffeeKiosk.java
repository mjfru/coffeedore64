import java.util.ArrayList;

public class CoffeeKiosk {
    
    // Member Variables:
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // Methods
    public void addMenuItem(String name, double price) {
        Item newMenuItem = new Item(name, price);
        menu.add(newMenuItem);
        newMenuItem.setIndex(menu.indexOf(newMenuItem));
    }

    public void displayMenu() {
        for(int i = 0; i < menu.size(); i++) {
            Item menuItem = menu.get(i);
            System.out.println(menuItem.getIndex() + " " + menuItem.getName() + ": $" + menuItem.getPrice());
        }
    }

    public void newOrder() {
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        //TODO Create a new order with the given input string
        Order order = new Order(name);
        //TODO Show the user the menu, so they can choose items to add.
        displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or 'q' to quit:");
        String itemNumber = System.console().readLine();
        
        //TODO Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            //TODO Get the item object from the menu, and add the item to the order
            try {
                order.addItem(menu.get(Integer.parseInt(itemNumber)));  //! Review this

            }
            catch (IndexOutOfBoundsException error){
                System.out.println("Error. Please enter a number that corresponds to the menu choices.");
            }
        //TODO Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter another menu item index or 'q' to quit:");
            itemNumber = System.console().readLine();
        }
        //TODO After you have collected their order, print the order details
        order.displayOrder();
    }
}
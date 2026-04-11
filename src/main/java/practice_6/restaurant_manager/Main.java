package practice_6.restaurant_manager;

public class Main {
    static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("French fries");
        manager.addNewOrder("Pasta");
        manager.addNewOrder("Margarita");
        manager.printOrders();

        // manager.getNextOrderForProcess();
        manager.deleteOrder("Pasta");
        manager.printOrders();
    }
}

import Classes.*;
import Service.ServiceProducts;

public class Main {
    public static void main(String[] args) {
        ///Assignment number 3
        Chair chair = new Chair(3, "Office", 120.0, true);
        Desk desk = new Desk(5, "Nevada", 520.0, 100, 120);
        Notebook notebook = new Notebook(10, "IDeaPad", 400.0, "Lenovo", 1024);
        Printer printer = new Printer(6, "PrinterMatic", 145.0, "HP", 40);

        ServiceProducts inventory = new ServiceProducts();
        inventory.addProduct(chair);
        inventory.addProduct(desk);
        inventory.addProduct(notebook);
        inventory.addProduct(printer);

        inventory.showInventory();

        ///Assignment number 4
        System.out.println("\n--- Now showing if there is any discount available...");
        inventory.showInventoryAndDiscounts();




    }
}
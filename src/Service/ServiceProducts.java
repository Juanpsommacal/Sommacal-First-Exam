package Service;

import Classes.*;

import java.util.ArrayList;

public class ServiceProducts {
    private ArrayList<ProductsForSale> inventory;

    public ServiceProducts() {
        inventory = new ArrayList<>();
    }

    public void showInventory(){
        for(ProductsForSale product : inventory){
            ///We print index + 1 so the first product isn't product number 0
            System.out.println("----- Product number " + (inventory.indexOf(product) + 1) + " ----- (" + product.getClass() + ")");
            System.out.println("" + product.toString());
        }
    }

    public void showInventoryAndDiscounts(){
        for(ProductsForSale product : inventory){
            System.out.println("----- Product number " + (inventory.indexOf(product) + 1) + " -----");
            System.out.println("" + product.toString());
            ///We have been told there is a sale on all Furniture products. So we make an IF to show discounted prices on Furniture
            if(product instanceof Furniture){
                System.out.println(" ON SALE! Discounted price: " + ((Furniture) product).applyDiscount(10));
            }
        }
    }

    public void addProduct(ProductsForSale product){
        inventory.add(product);
    }

    public void increasePrice(){
        for(ProductsForSale product : inventory){
            System.out.println("Product: " + product.getClass() +
                                ", Name: " + product.getName() +
                                ", Previous price: " + product.getPrice());
            if(product instanceof Chair){
                product.increasePrice(5);
            } else if (product instanceof Desk){
                product.increasePrice(10);
            } else if (product instanceof Printer){
                product.increasePrice(15);
            } else if (product instanceof Notebook){
                product.increasePrice(20);
            }
            System.out.println("New Price: " + product.getPrice());
        }
    }


}

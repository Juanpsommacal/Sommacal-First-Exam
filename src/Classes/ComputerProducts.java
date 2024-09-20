package Classes;

public abstract class ComputerProducts extends ProductsForSale {
    private String manufacturer;

    public ComputerProducts(Integer stock, String name, Double price, String manufacturer) {
        super(stock, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}

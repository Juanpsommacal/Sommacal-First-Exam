package Classes;

public abstract class ProductsForSale {
    private Integer stock;
    private String name;
    private Double price;

    public ProductsForSale(Integer stock, String name, Double price) {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public abstract double applyDiscount(double discountPorcentage);
    public abstract String toString();
    public abstract void increasePrice(double increasePorcentage);
}

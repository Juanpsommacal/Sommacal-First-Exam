package Classes;

public class Notebook extends ComputerProducts {
    private Integer memory;

    public Notebook(Integer stock, String name, Double price, String manufacturer, Integer memory) {
        super(stock, name, price, manufacturer);
        this.memory = memory;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public double applyDiscount(double discountPorcentage){
        return getPrice() - (getPrice() * discountPorcentage / 100);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Manufacturer: " + getManufacturer() +
                ", Memory: " + getMemory() +
                ", Stock: " + getStock() +
                '}';
    }

    @Override
    public void increasePrice(double increasePorcentage){
        setPrice(getPrice() + getPrice() * increasePorcentage / 100);
    }
}

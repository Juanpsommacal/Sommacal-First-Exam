package Classes;

public class Printer extends ComputerProducts {
    private Integer printsPerMinute;

    public Printer(Integer stock, String name, Double price, String manufacturer, Integer printsPerMinute) {
        super(stock, name, price, manufacturer);
        this.printsPerMinute = printsPerMinute;
    }

    public Integer getPrintsPerMinute() {
        return printsPerMinute;
    }

    public void setPrintsPerMinute(Integer printsPerMinute) {
        this.printsPerMinute = printsPerMinute;
    }

    @Override
    public double applyDiscount(double discountPorcentage){
        return getPrice() - (getPrice() * discountPorcentage / 100);
    }

    @Override
    public void increasePrice(double increasePorcentage){
        setPrice(getPrice() + getPrice() * increasePorcentage / 100);
    }

    @Override
    public String toString() {
        return "Printer{" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Manufacturer: " + getManufacturer() +
                ", Prints per minute: " + getPrintsPerMinute() +
                ", Stock: " + getStock() +
                '}';
    }
}

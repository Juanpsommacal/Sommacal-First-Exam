package Classes;

public class Chair extends Furniture {
    private Boolean hasWheel;

    public Chair(Integer stock, String name, Double price, Boolean hasWheel) {
        super(stock, name, price);
        this.hasWheel = hasWheel;
    }

    public Boolean getHasWheel() {
        return hasWheel;
    }

    public void setHasWheel(Boolean hasWheel) {
        this.hasWheel = hasWheel;
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
        return "Chair{" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Has wheels: " + getHasWheel() +
                ", Stock: " + getStock() +
                '}';
    }
}
